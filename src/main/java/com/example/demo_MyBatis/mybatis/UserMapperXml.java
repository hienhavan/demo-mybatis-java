package com.example.demo_MyBatis.mybatis;

import com.example.demo_MyBatis.model.UserDao;

import java.util.List;

public interface UserMapperXml {
    List<UserDao> selectAllUsers();
    UserDao selectUserById(int id);
    void deleteUserById(int id);
    void updateUser(UserDao user);
    void insertUser(UserDao user);
}