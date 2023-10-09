package com.dnk.usercrudsahib.service;

import com.dnk.usercrudsahib.model.User;

import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();


        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(1, "AAAA"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));
        userList.add(new User(2, "BBBBB"));

        //System.out.println(userList);


        /*User user = userList.stream()
                .filter(u -> u.getUsername().equals("BBBBB"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("USer not found"));

        System.out.println(user);
*/


        User foundUser = null;
        int counter = 0;

        while (foundUser == null) {
            if (userList.get(counter).getUsername().equals("AAAA")) {
                foundUser = userList.get(counter);
            } else {
                counter++;
            }
        }


        int i;
        for (i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals("AAAA")) {
                foundUser = userList.get(i);
                break;
            }
        }

        System.out.println(foundUser);
        System.out.println(i);

    }
}
