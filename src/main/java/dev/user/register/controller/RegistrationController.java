package dev.user.register.controller;


import dev.user.register.dto.ResponseDto;
import dev.user.register.dto.UserDto;
import dev.user.register.dto.UserResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class RegistrationController {

   @PostMapping("/user/register")
    public ResponseDto<UserResponseDto> registerUser(@RequestBody UserDto userDto){
        return new ResponseDto<>(
                new UserResponseDto(1L, userDto.getFullName() ,userDto.getEmail(), true),
                HttpStatus.OK
        );
    }

    @GetMapping("/healthCheck")
    public String checkStatus(){
        System.out.println("check health");
        return "Archit";
    }
}
