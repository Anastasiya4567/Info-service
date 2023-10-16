package user.info.service.infrastructure.adapter.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class CompleteUserInfo {

    @JsonProperty("login")
    private String login;

    @JsonProperty("id")
    private long id;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("gravatar_id")
    private String gravatarId;

    @JsonProperty("url")
    private String url;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("followers_url")
    private String followersUrl;

    @JsonProperty("following_url")
    private String followingUrl;

    @JsonProperty("gists_url")
    private String gistsUrl;

    @JsonProperty("starred_url")
    private String starredUrl;

    @JsonProperty("subscriptions_url")
    private String subscriptionsUrl;

    @JsonProperty("organizations_url")
    private String organizationsUrl;

    @JsonProperty("repos_url")
    private String reposUrl;

    @JsonProperty("events_url")
    private String eventsUrl;

    @JsonProperty("received_events_url")
    private String receivedEventsUrl;

    @JsonProperty("type")
    private String type;

    @JsonProperty("site_admin")
    private boolean siteAdmin;

    @JsonProperty("name")
    private String name;

    @JsonProperty("company")
    private String company;

    @JsonProperty("blog")
    private String blog;

    @JsonProperty("location")
    private String location;

    @JsonProperty("email")
    private String email;

    @JsonProperty("hireable")
    private String hireable;

    @JsonProperty("bio")
    private String bio;

    @JsonProperty("twitter_username")
    private String twitterUsername;

    @JsonProperty("public_repos")
    private long publicRepos;

    @JsonProperty("public_gists")
    private long publicGists;

    @JsonProperty("followers")
    private long followers;

    @JsonProperty("following")
    private long following;

    @JsonProperty("created_at")
    private OffsetDateTime createdAt;
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    public CompleteUserInfo() {
    }

    public String getLogin() {
        return login;
    }

    public long getId() {
        return id;
    }

    public String getNodeId() {
        return nodeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public String getUrl() {
        return url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public String getType() {
        return type;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
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

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public long getPublicRepos() {
        return publicRepos;
    }

    public long getPublicGists() {
        return publicGists;
    }

    public long getFollowers() {
        return followers;
    }

    public long getFollowing() {
        return following;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
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

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setPublicRepos(long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public void setFollowers(long followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "CompleteUserInfo{" +
            "login='" + login + '\'' +
            ", id=" + id +
            ", nodeId='" + nodeId + '\'' +
            ", avatarUrl='" + avatarUrl + '\'' +
            ", gravatarId='" + gravatarId + '\'' +
            ", url='" + url + '\'' +
            ", htmlUrl='" + htmlUrl + '\'' +
            ", followersUrl='" + followersUrl + '\'' +
            ", followingUrl='" + followingUrl + '\'' +
            ", gistsUrl='" + gistsUrl + '\'' +
            ", starredUrl='" + starredUrl + '\'' +
            ", subscriptionsUrl='" + subscriptionsUrl + '\'' +
            ", organizationsUrl='" + organizationsUrl + '\'' +
            ", reposUrl='" + reposUrl + '\'' +
            ", eventsUrl='" + eventsUrl + '\'' +
            ", receivedEventsUrl='" + receivedEventsUrl + '\'' +
            ", type='" + type + '\'' +
            ", siteAdmin=" + siteAdmin +
            ", name='" + name + '\'' +
            ", company='" + company + '\'' +
            ", blog='" + blog + '\'' +
            ", location='" + location + '\'' +
            ", email='" + email + '\'' +
            ", hireable='" + hireable + '\'' +
            ", bio='" + bio + '\'' +
            ", twitterUsername='" + twitterUsername + '\'' +
            ", publicRepos=" + publicRepos +
            ", publicGists=" + publicGists +
            ", followers=" + followers +
            ", following=" + following +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            '}';
    }
}
