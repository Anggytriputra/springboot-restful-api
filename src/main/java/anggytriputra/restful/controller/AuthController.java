package anggytriputra.restful.controller;

import anggytriputra.restful.entity.User;
import anggytriputra.restful.model.LoginUserRequest;
import anggytriputra.restful.model.TokenResponse;
import anggytriputra.restful.model.WebResponse;
import anggytriputra.restful.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping(
            path = "/api/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<TokenResponse> login(@RequestBody LoginUserRequest request){
        TokenResponse tokenResponse = authService.login(request);
        return  WebResponse.<TokenResponse>builder().data(tokenResponse).build();

    }


    @DeleteMapping(
            path = "/api/auth/logout",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<String> logOut(User user){
        authService.logOut(user);
        return WebResponse.<String>builder().data("OK").build();
    }
}
