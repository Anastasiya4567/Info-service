package user.info.service.application;

import user.info.service.application.domain.ShortUserInfoCreator;
import user.info.service.infrastructure.port.InfoServicePort;

import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import user.info.service.interfaces.rest.response.ShortUserInfo;

@Service
public class UserInfoServiceFacade {

    private final Logger log = LogManager.getLogger(this.getClass());

    private final InfoServicePort infoServicePort;

    private final ShortUserInfoCreator shortUserInfoCreator;

    @Autowired
    public UserInfoServiceFacade(InfoServicePort infoServicePort, ShortUserInfoCreator shortUserInfoCreator) {
        this.infoServicePort = infoServicePort;
        this.shortUserInfoCreator = shortUserInfoCreator;
    }

    public ShortUserInfo getShortUserInfo(String login) {
        CompleteUserInfo completeUserInfo = infoServicePort.getCompleteUserInfo(login);
        return shortUserInfoCreator.create(completeUserInfo);
    }

}
