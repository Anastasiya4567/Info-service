package user.info.service.application.assertion;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

import user.info.service.interfaces.rest.response.ShortUserInfo;

import java.time.OffsetDateTime;


public class ShortUserInfoAssertion extends AbstractAssert<ShortUserInfoAssertion, ShortUserInfo> {

    public static ShortUserInfoAssertion assertThat(ShortUserInfo actual) {
        return new ShortUserInfoAssertion(actual);
    }

    public ShortUserInfoAssertion(ShortUserInfo shortUserInfo) {
        super(shortUserInfo, ShortUserInfoAssertion.class);
    }

    public ShortUserInfoAssertion hasId(Long id) {
        Assertions.assertThat(actual.getId()).isEqualTo(id);
        return this;
    }

    public ShortUserInfoAssertion hasLogin(String login) {
        Assertions.assertThat(actual.getLogin()).isEqualTo(login);
        return this;
    }

    public ShortUserInfoAssertion hasName(String name) {
        Assertions.assertThat(actual.getName()).isEqualTo(name);
        return this;
    }

    public ShortUserInfoAssertion hasAvatarUrl(String avatarUrl) {
        Assertions.assertThat(actual.getAvatarUrl()).isEqualTo(avatarUrl);
        return this;
    }

    public ShortUserInfoAssertion hasCreatedAt(OffsetDateTime createdAt) {
        Assertions.assertThat(actual.getCreatedAt()).isEqualTo(createdAt);
        return this;
    }

    public ShortUserInfoAssertion hasCalculations(double calculations) {
        Assertions.assertThat(actual.getCalculations()).isEqualTo(calculations);
        return this;
    }

}