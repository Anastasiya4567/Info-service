package user.info.service.infrastructure.adapter.rest;

import static org.apache.logging.log4j.LogManager.getLogger;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.infrastructure.port.InfoServicePort;

@Component
public class InfoServiceHTTPSender implements InfoServicePort {

    private final InfoServiceClient infoServiceClient;

    private final Logger log = getLogger(this.getClass());

    @Autowired
    public InfoServiceHTTPSender(InfoServiceClient infoServiceClient) {
        this.infoServiceClient = infoServiceClient;
    }

    @Override
    public CompleteUserInfo getCompleteUserInfo(String login) {
        var response = infoServiceClient.getUserInfo(login);
        log.info("Response with complete user info received: {}", response);
        return response;
    }
}
