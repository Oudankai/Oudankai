package io.getarrays.userservice01;

import io.getarrays.userservice01.domain.Role;
import io.getarrays.userservice01.domain.User;
import io.getarrays.userservice01.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class Userservice01Application {

    public static void main(String[] args) {
        SpringApplication.run(Userservice01Application.class, args);
    }

    @Bean
    BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



@Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Oudankai Amine", "Oudankai", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Hicham Bassma", "Bassma", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Douiry Hamza", "Douiry", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Arfy Mahmoud", "Arfy", "123", new ArrayList<>()));

            userService.addRoleToUser("Oudankai", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("Arfy", "ROLE_MANAGER");
            userService.addRoleToUser("Bassma", "ROLE_USER");
            userService.addRoleToUser("Oudankai", "ROLE_ADMIN");
            userService.addRoleToUser("Douiry ", "ROLE_ADMIN");


        };
    }

}
