package com.lambdacode.springcrud.service.impl;

import com.lambdacode.springcrud.entity.User;
import com.lambdacode.springcrud.repository.UserRepository;
import com.lambdacode.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(User user) {
         userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }


}
