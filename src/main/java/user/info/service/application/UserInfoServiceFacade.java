package user.info.service.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.vavr.control.Option;
import io.vavr.control.Try;
import user.info.service.infrastructure.adapter.postgres.UserRequestRepository;
import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.infrastructure.port.InfoServicePort;
import user.info.service.interfaces.rest.response.ShortUserInfo;

@Service
public class UserInfoServiceFacade {

    private final Logger log = LogManager.getLogger(this.getClass());

    private final InfoServicePort infoServicePort;

    private final ShortUserInfoCreator shortUserInfoCreator;

    private final UserRequestRepository userRequestRepository;

    @Autowired
    public UserInfoServiceFacade(InfoServicePort infoServicePort, ShortUserInfoCreator shortUserInfoCreator, UserRequestRepository userRequestRepository) {
        this.infoServicePort = infoServicePort;
        this.shortUserInfoCreator = shortUserInfoCreator;
        this.userRequestRepository = userRequestRepository;
    }

    public ShortUserInfo getShortUserInfo(String login) {
        return Try.of(() -> {
                CompleteUserInfo completeUserInfo = infoServicePort.getCompleteUserInfo(login);
                incrementRequestCounterFor(login);
                return shortUserInfoCreator.create(completeUserInfo);
            })
            .getOrElseThrow((throwable) -> {
                throw new RuntimeException("Error while getting user info occurred: " + throwable.getMessage());
            });
    }

    private void incrementRequestCounterFor(String login) {
        Option<UserRequest> userRequestFromDB = Option.ofOptional(userRequestRepository.findByLogin(login));
        UserRequest userRequest = userRequestFromDB.getOrElse(new UserRequest(login, 0L));
        userRequest.setRequestCounter(userRequest.getRequestCounter() + 1);
        userRequestRepository.save(userRequest);
    }

}
