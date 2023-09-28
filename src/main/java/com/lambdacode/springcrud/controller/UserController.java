package com.lambdacode.springcrud.controller;

import com.lambdacode.springcrud.entity.User;
import com.lambdacode.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        userService.addUser(user);
        return "success add user";
    }


}
