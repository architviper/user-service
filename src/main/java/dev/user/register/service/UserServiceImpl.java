package dev.user.register.service;

import dev.user.register.dto.UserDto;
import dev.user.register.model.User;
import dev.user.register.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{


    @Autowired
    UserRepository userRepository;

    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    @Override
    public User registerUser(UserDto userDto) {
        if(userRepository.findByEmail(userDto.getEmail()) != null){
            //TODO: throw exception
        }
        User user = new User();
        user.setFullName(userDto.getFullName());
        user.setEmail(userDto.getEmail());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setActive(false);

        User savedUser=userRepository.save(user);

        return savedUser;

    }
}
