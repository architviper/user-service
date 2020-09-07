package dev.user.register.repository;

import dev.user.register.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {

    @Override
    Optional<User> findById(Long aLong);

    User findByEmail(String email);

}
