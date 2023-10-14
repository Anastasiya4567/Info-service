package user.info.service;

import user.info.service.infrastructure.adapter.rest.configuration.FeignClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@EnableFeignClients
@SpringBootApplication
@EnableConfigurationProperties
@ImportAutoConfiguration({FeignAutoConfiguration.class, FeignClientConfig.class})
public class UserInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(UserInfoServiceApplication.class);
        springApplication.run(args);
    }

}

