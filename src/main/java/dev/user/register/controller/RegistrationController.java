package dev.user.register.controller;


import dev.user.register.dto.ResponseDto;
import dev.user.register.dto.UserDto;
import dev.user.register.dto.UserResponseDto;
import dev.user.register.model.User;
import dev.user.register.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

    @Autowired
    UserService userService;

   @PostMapping("/user/register")
    public ResponseDto<UserResponseDto> registerUser(@RequestBody UserDto userDto){

       User user = userService.registerUser(userDto);

       return new ResponseDto<>(
                new UserResponseDto(1L, user.getFullName(), user.getEmail(), user.isActive() ),
                HttpStatus.OK
        );
    }

    @GetMapping("/healthCheck")
    public String checkStatus(){
        System.out.println("check health");
        return "Archit";
    }
}
