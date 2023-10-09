package com.dnk.usercrudsahib;

import com.dnk.usercrudsahib.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class UserCrudSahibApplication {

    private List<User> userList;

    public static void main(String[] args) {
        SpringApplication.run(UserCrudSahibApplication.class, args);
    }

    @Bean
    public List<User> userList() {
        return this.userList;
    }
}
