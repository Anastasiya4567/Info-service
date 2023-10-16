package user.info.service.application;

import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import user.info.service.application.mapper.UserInfoMapper;
import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.interfaces.rest.response.ShortUserInfo;

@Component
public class ShortUserInfoCreator {

    private final UserInfoMapper userInfoMapper = Mappers.getMapper(UserInfoMapper.class);

    public ShortUserInfo create(CompleteUserInfo completeUserInfo) {
        ShortUserInfo shortUserInfo = userInfoMapper.mapFromCompleteUserInfo(completeUserInfo);
        shortUserInfo.setCalculations(calculate(completeUserInfo));
        return shortUserInfo;
    }

    private double calculate(CompleteUserInfo completeUserInfo) {
        return (double) 6 * (2 + completeUserInfo.getPublicRepos()) / completeUserInfo.getFollowers();
    }
}
