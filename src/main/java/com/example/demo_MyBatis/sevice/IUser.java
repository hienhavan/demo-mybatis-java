package com.example.demo_MyBatis.sevice;

import com.example.demo_MyBatis.model.UserDao;

import java.util.List;

public interface IUser {
    List<UserDao> getAllUsers();

    UserDao insertUser(UserDao user);

    UserDao getUserById(int id);

    void deleteUserById(int id);

    UserDao updateUser(UserDao user);
}
