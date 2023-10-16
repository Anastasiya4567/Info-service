package user.info.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import user.info.service.infrastructure.adapter.rest.configuration.FeignClientConfig;

@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties
@EnableJpaRepositories
@ImportAutoConfiguration({FeignAutoConfiguration.class, FeignClientConfig.class})
public class UserInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(UserInfoServiceApplication.class);
        springApplication.run(args);
    }

}

