package user.info.service.application;

import java.time.OffsetDateTime;

import org.junit.jupiter.api.Test;

import user.info.service.application.assertion.ShortUserInfoAssertion;
import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;
import user.info.service.interfaces.rest.response.ShortUserInfo;

public class ShortUserInfoCreatorTest {

    private static final Long TEST_ID = 1234567L;
    private static final String TEST_LOGIN = "test login";
    private static final String TEST_NAME = "test name";
    private static final String TEST_AVATAR_URL = "test avatar url";
    private static final OffsetDateTime TEST_CREATED_AT = OffsetDateTime.now();

    private final ShortUserInfoCreator shortUserInfoCreator = new ShortUserInfoCreator();

    @Test
    void create() {
        //given
        CompleteUserInfo completeUserInfo = createUserInfo();

        //when
        final ShortUserInfo shortUserInfo = shortUserInfoCreator.create(completeUserInfo);

        //then
        ShortUserInfoAssertion.assertThat(shortUserInfo)
            .hasId(TEST_ID)
            .hasLogin(TEST_LOGIN)
            .hasName(TEST_NAME)
            .hasAvatarUrl(TEST_AVATAR_URL)
            .hasCreatedAt(TEST_CREATED_AT)
            .hasCalculations(4.5);

    }

    private CompleteUserInfo createUserInfo() {
        CompleteUserInfo completeUserInfo = new CompleteUserInfo();
        completeUserInfo.setId(TEST_ID);
        completeUserInfo.setLogin(TEST_LOGIN);
        completeUserInfo.setName(TEST_NAME);
        completeUserInfo.setAvatarUrl(TEST_AVATAR_URL);
        completeUserInfo.setCreatedAt(TEST_CREATED_AT);
        completeUserInfo.setPublicRepos(4);
        completeUserInfo.setFollowers(8);
        return completeUserInfo;
    }

}
