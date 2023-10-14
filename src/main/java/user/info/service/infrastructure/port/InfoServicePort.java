package user.info.service.infrastructure.port;

import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;

public interface InfoServicePort {

    CompleteUserInfo getCompleteUserInfo(String login);

}
