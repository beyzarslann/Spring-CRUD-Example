package com.lambdacode.springcrud.service;

import com.lambdacode.springcrud.entity.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsers();
}
