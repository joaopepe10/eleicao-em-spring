package joaopepe10.com.github.eleicao.controller;

import joaopepe10.com.github.eleicao.models.User;
import joaopepe10.com.github.eleicao.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> save(User user){
        return ResponseEntity.ok(userService.save(user));
    }

}
