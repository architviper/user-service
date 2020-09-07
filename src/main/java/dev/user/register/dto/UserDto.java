package dev.user.register.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDto {

    @NotEmpty
    @Size(min = 5)
    private String fullName;

    // TODO: Implement Custom validators
    @NotEmpty
    @Size(min = 1)
    private  String email;

    // TODO: Implement Custom validators
    @NotEmpty
    @Size(min = 6)
    private String password;
}


// behind the scene spring will accept network request
//userDto = new UserDto();
//userDto.setfullName("adsad");
//userDto.setemail("adsad");
//userDto.setpassword("adsad");