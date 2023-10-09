package com.dnk.usercrudsahib.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
public class User {

    public User(Integer id, String username) {
        this.id = id;
        this.username = username;
    }

    private Integer id;
    private String username;
    private String fullName;
    private Integer age;
    private String role;
    private LocalDateTime created;
    private LocalDateTime updated;
}
