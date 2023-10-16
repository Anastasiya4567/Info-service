package user.info.service.application;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import java.util.Objects;


@Entity
@Table(name = "users_requests", uniqueConstraints = {
    @UniqueConstraint(columnNames = "login")
})
public class UserRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "request_counter")
    private Long requestCounter;

    public UserRequest() {
    }

    public UserRequest(String login, Long requestCounter) {
        this.login = login;
        this.requestCounter = requestCounter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getRequestCounter() {
        return requestCounter;
    }

    public void setRequestCounter(Long requestCounter) {
        this.requestCounter = requestCounter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return Objects.equals(login, that.login) && Objects.equals(requestCounter, that.requestCounter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, requestCounter);
    }
}
