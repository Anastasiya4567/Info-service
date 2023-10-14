package user.info.service.infrastructure.adapter.rest;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import user.info.service.infrastructure.adapter.rest.configuration.FeignClientConfig;
import user.info.service.infrastructure.adapter.rest.response.CompleteUserInfo;

@FeignClient(name = "github-api", url = "${github-host}", configuration = FeignClientConfig.class)
public interface InfoServiceClient {

    @GetMapping("/{login}")
    CompleteUserInfo getUserInfo(@PathVariable("login") String login);

}
