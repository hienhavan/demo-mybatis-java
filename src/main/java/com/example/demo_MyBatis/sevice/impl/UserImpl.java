package com.example.demo_MyBatis.sevice.impl;


import com.example.demo_MyBatis.model.UserDao;
import com.example.demo_MyBatis.mybatis.UserMapper;
import com.example.demo_MyBatis.sevice.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserImpl implements IUser {

    private final UserMapper userMapper;

    public List<UserDao> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    public UserDao insertUser(UserDao user) {
        userMapper.insertUser(user);
        return user;
    }
    public UserDao getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public void deleteUserById(int id) {
        userMapper.deleteUserById(id);
    }

    public UserDao updateUser(UserDao user) {
        return userMapper.updateUser(user);
    }
}