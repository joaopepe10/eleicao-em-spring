package joaopepe10.com.github.eleicao.controller;

import jakarta.validation.Valid;
import joaopepe10.com.github.eleicao.dto.user.CreateUserDto;
import joaopepe10.com.github.eleicao.dto.user.ReadUserDto;
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
    public ResponseEntity<ReadUserDto> save(@RequestBody @Valid CreateUserDto user){
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("{id}")
    public ResponseEntity<ReadUserDto> getById(@PathVariable long id){
        return ResponseEntity.ok(userService.findByIdAndReturnReadDto(id));
    }

}
