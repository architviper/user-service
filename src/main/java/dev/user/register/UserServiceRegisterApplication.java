package dev.user.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class UserServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceRegisterApplication.class, args);
	}

}
