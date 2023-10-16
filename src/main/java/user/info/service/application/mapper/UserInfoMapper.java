package user.info.service.application.mapper;

import org.mapstruct.Mapper;

import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.interfaces.rest.response.ShortUserInfo;

@Mapper
public interface UserInfoMapper {

    ShortUserInfo mapFromCompleteUserInfo(final CompleteUserInfo completeUserInfo);

}