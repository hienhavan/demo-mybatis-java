package com.example.demo_MyBatis.controller;

import com.example.demo_MyBatis.model.UserDao;
import com.example.demo_MyBatis.sevice.IUser;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final IUser userService;

    @GetMapping("/get-users")
    public List<UserDao> getUserList() {
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public UserDao insertUser(@RequestBody UserDao user) {
        return userService.insertUser(user);
    }

    @GetMapping("/get-user")
    public UserDao getUserById(int id) {
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete-user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserById(int id) {
        userService.deleteUserById(id);
    }

    @PutMapping("/update-user")
    public UserDao updateUser(@RequestBody UserDao user) {
        return userService.updateUser(user);
    }
}
