package user.info.service.interfaces.rest.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;

@JsonInclude()
public class ShortUserInfo {

    private long id;
    private String login;
    private String name;
    private String type;
    private String avatarUrl;
    private OffsetDateTime createdAt;
    private double calculations;

    public ShortUserInfo() {
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public double getCalculations() {
        return calculations;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setCalculations(double calculations) {
        this.calculations = calculations;
    }
}
