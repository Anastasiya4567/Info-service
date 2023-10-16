package user.info.service.infrastructure.adapter.postgres;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import user.info.service.application.UserRequest;

@Repository
public interface UserRequestRepository extends JpaRepository<UserRequest, Long> {

    @Override
    UserRequest save(UserRequest userRequest);

    Optional<UserRequest> findByLogin(String login);

}