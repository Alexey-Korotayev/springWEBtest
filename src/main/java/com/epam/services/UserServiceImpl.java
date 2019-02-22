package com.epam.services;

import com.epam.dao.UserDao;
import com.epam.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public void addUser(User user) throws Exception {
        if ( user.getName() == null || user.getName().isEmpty()) {
            throw new Exception("Не заполнено имя");
        } else {
            userDao.addUser(user);
        }
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    public void deleteUserById(int id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }
}
