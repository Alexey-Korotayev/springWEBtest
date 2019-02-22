package com.epam.dao;

import com.epam.entity.User;

import java.util.List;

public interface UserDao {

    List<com.epam.entity.User> findAll();

    void addUser(User user);

    User getUserById(int id);

    void deleteUserById(int id);

    void update(User user);
}
