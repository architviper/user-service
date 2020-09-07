package dev.user.register.service;

import dev.user.register.dto.UserDto;
import dev.user.register.model.User;
import org.springframework.stereotype.Service;

public interface UserService {

     User registerUser(UserDto userDto);

}
