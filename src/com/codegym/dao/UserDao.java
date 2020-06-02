package com.codegym.dao;

import com.codegym.model.Login;
import com.codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    public static List<User> list;

    static {
        list = new ArrayList<>();
        User user = new User();
        user.setName("badat");
        user.setPass("badat1996");
        user.setAccount("lebadat");
        user.setAge(24);
        user.setEmail("lebadta1996ptit@gmail.com");

        User user1 = new User();
        user1.setName("badat1");
        user1.setPass("badat1996");
        user1.setAccount("lebadat1");
        user1.setAge(24);
        user.setEmail("lebadta1996ptit@gmail.com");

        User user2 = new User();
        user2.setName("badat2");
        user2.setPass("badat1996");
        user2.setAccount("lebadat2");
        user2.setAge(24);
        user2.setEmail("lebadta1996ptit@gmail.com");
        list.add(user);
        list.add(user1);
        list.add(user2);
    }

    public static User checkLogin(Login login) {
        for (User user : list) {
            if (user.getAccount().equals(login.getAccount()) && user.getPass().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
