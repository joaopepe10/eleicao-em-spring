package joaopepe10.com.github.eleicao.controller;

import joaopepe10.com.github.eleicao.dto.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.ReadUserDto;
import joaopepe10.com.github.eleicao.service.UserServiceImpl;
import joaopepe10.com.github.eleicao.service.interfaces.IUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final IUserService userService;

    public UserController(UserServiceImpl userServiceImpl) {
        this.userService = userServiceImpl;
    }

    @PostMapping
    public ResponseEntity<User> save(User user){
        return ResponseEntity.ok(userService.save(user));
    }

}
