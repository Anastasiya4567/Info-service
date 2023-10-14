package user.info.service.application.domain;

import org.springframework.stereotype.Component;

import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.interfaces.rest.response.ShortUserInfo;

@Component
public class ShortUserInfoCreator {
    public ShortUserInfo create(CompleteUserInfo completeUserInfo) {
        ShortUserInfo shortUserInfo = new ShortUserInfo();
        shortUserInfo.setId(completeUserInfo.getId());
        shortUserInfo.setLogin(completeUserInfo.getLogin());
        shortUserInfo.setName(completeUserInfo.getName());
        shortUserInfo.setType(completeUserInfo.getType());
        shortUserInfo.setAvatarUrl(completeUserInfo.getAvatar_url());
        shortUserInfo.setCreatedAt(completeUserInfo.getCreated_at());
        double calculations = 6 / completeUserInfo.getFollowers() * (2 + completeUserInfo.getPublic_repos());
        shortUserInfo.setCalculations(calculations);
        return shortUserInfo;
    }
}
