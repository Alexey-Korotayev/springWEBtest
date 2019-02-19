package com.epam.dao;

import com.epam.entity.User;

import java.util.List;

public interface UserDao {

    List<com.epam.entity.User> findAll();
}
