package com.epam.services;

import com.epam.entity.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void addUser(User user) throws Exception;

    User getUserById(int id);

    void deleteUserById(int id);

    void update(User user);
}
