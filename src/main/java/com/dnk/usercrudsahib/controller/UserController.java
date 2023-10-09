package com.dnk.usercrudsahib.controller;


import com.dnk.usercrudsahib.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class UserController {


    private final List<User> userList;

    public UserController(@Qualifier("userList") List<User> userList) {
        this.userList = userList;
    }


    @GetMapping("user/id/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        User foundUser = null;
        int counter = 0;

        while (foundUser == null || counter == userList.size() - 1) {

            User currentUser = userList.get(counter);

            if (Objects.equals(currentUser.getId(), id)) {
                foundUser = currentUser;
            } else {
                counter++;
            }
        }


        if (foundUser == null) {
            System.err.println("User not found");
            return null;
        }

        return foundUser;
    }

    @GetMapping("user/all")
    public List<User> getAll() {
        return this.userList;
    }


    @PostMapping("user/create")
    public User createUser(@RequestBody User user) {
        if (Objects.nonNull(user)) {
            this.userList.add(user);

            return user;
        } else {
            System.err.println("Empty user");
            return null;
        }

    }

    @DeleteMapping("user/delete/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable("id") Integer id) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);

            if (user.getId().equals(id)) {
                userList.remove(i);
                break;
            }
        }
    }


}
