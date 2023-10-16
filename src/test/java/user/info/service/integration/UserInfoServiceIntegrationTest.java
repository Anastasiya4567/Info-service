package user.info.service.integration;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import user.info.service.application.UserInfoServiceFacade;
import user.info.service.application.UserRequest;
import user.info.service.infrastructure.adapter.postgres.UserRequestRepository;


@RunWith(SpringRunner.class)
@Testcontainers
@Transactional
@SpringBootTest
public class UserInfoServiceIntegrationTest {

    @Autowired
    UserInfoServiceFacade userInfoServiceFacade;

    @Autowired
    UserRequestRepository userRequestRepository;

    @Container
    static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:16.0")
        .withDatabaseName("requests")
        .withUsername("postgres")
        .withPassword("postgres");

    @DynamicPropertySource
    static void registerPgProperties(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgreSQLContainer::getJdbcUrl);
    }

    static {
        postgreSQLContainer.start();
    }

    @Test
    @DisplayName("Add user request record if no record with this login exists")
    public void addRecordIfNotExist() {
        //given
        createAndSaveUserRequests();

        //when
        userInfoServiceFacade.getShortUserInfo("octocat");

        //then
        List<UserRequest> userRequests = userRequestRepository.findAll();
        Assertions.assertThat(userRequests.size()).isEqualTo(4);
        UserRequest lastUserRequest = userRequests.get(userRequests.size() - 1);
        Assertions.assertThat(lastUserRequest.getLogin()).isEqualTo("octocat");
        Assertions.assertThat(lastUserRequest.getRequestCounter()).isEqualTo(1L);

    }

    @Test
    @DisplayName("Increment request counter on request")
    public void incrementRequestCounter() {
        //given
        createAndSaveUserRequests();

        //when
        userInfoServiceFacade.getShortUserInfo("anna");

        //then
        List<UserRequest> userRequests = userRequestRepository.findAll();
        Assertions.assertThat(userRequests.size()).isEqualTo(3);
        UserRequest userRequestForAnna = userRequests.get(2);
        Assertions.assertThat(userRequestForAnna.getLogin()).isEqualTo("anna");
        Assertions.assertThat(userRequestForAnna.getRequestCounter()).isEqualTo(3L);

    }

    private void createAndSaveUserRequests() {
        userRequestRepository.save(new UserRequest("eve", 6L));
        userRequestRepository.save(new UserRequest("lisa", 5L));
        userRequestRepository.save(new UserRequest("anna", 2L));
    }

}
