package user.info.service.interfaces.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import user.info.service.application.UserInfoServiceFacade;
import user.info.service.interfaces.rest.response.ShortUserInfo;

@RequestMapping(value = "/users")
@RestController
public class UserInfoServiceController {

    private final UserInfoServiceFacade userInfoServiceFacade;

    @Autowired
    public UserInfoServiceController(UserInfoServiceFacade userInfoServiceFacade) {
        this.userInfoServiceFacade = userInfoServiceFacade;
    }

    @GetMapping("/{login}")
    public ResponseEntity<ShortUserInfo> getShortUserInfo(@PathVariable String login) {
        return ResponseEntity.ok(userInfoServiceFacade.getShortUserInfo(login));
    }

}
