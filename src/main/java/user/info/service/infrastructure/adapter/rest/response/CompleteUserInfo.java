package user.info.service.infrastructure.adapter.rest.response;

import java.time.OffsetDateTime;

public class CompleteUserInfo {

    private String login;
    private long id;
    private String node_id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private String twitter_username;
    private long public_repos;
    private long public_gists;
    private long followers;
    private long following;
    private OffsetDateTime created_at;
    private OffsetDateTime updated_at;

    public CompleteUserInfo() {
    }

    public String getLogin() {
        return login;
    }

    public long getId() {
        return id;
    }

    public String getNode_id() {
        return node_id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public boolean getSite_admin() {
        return site_admin;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public String getTwitter_username() {
        return twitter_username;
    }

    public float getPublic_repos() {
        return public_repos;
    }

    public float getPublic_gists() {
        return public_gists;
    }

    public float getFollowers() {
        return followers;
    }

    public float getFollowing() {
        return following;
    }

    public OffsetDateTime getCreated_at() {
        return created_at;
    }

    public OffsetDateTime getUpdated_at() {
        return updated_at;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
            "login='" + login + '\'' +
            ", id=" + id +
            ", node_id='" + node_id + '\'' +
            ", avatar_url='" + avatar_url + '\'' +
            ", gravatar_id='" + gravatar_id + '\'' +
            ", url='" + url + '\'' +
            ", html_url='" + html_url + '\'' +
            ", followers_url='" + followers_url + '\'' +
            ", following_url='" + following_url + '\'' +
            ", gists_url='" + gists_url + '\'' +
            ", starred_url='" + starred_url + '\'' +
            ", subscriptions_url='" + subscriptions_url + '\'' +
            ", organizations_url='" + organizations_url + '\'' +
            ", repos_url='" + repos_url + '\'' +
            ", events_url='" + events_url + '\'' +
            ", received_events_url='" + received_events_url + '\'' +
            ", type='" + type + '\'' +
            ", site_admin=" + site_admin +
            ", name='" + name + '\'' +
            ", company='" + company + '\'' +
            ", blog='" + blog + '\'' +
            ", location='" + location + '\'' +
            ", email='" + email + '\'' +
            ", hireable='" + hireable + '\'' +
            ", bio='" + bio + '\'' +
            ", twitter_username='" + twitter_username + '\'' +
            ", public_repos=" + public_repos +
            ", public_gists=" + public_gists +
            ", followers=" + followers +
            ", following=" + following +
            ", created_at='" + created_at + '\'' +
            ", updated_at='" + updated_at + '\'' +
            '}';
    }
}
