package com.epam.dao;

import com.epam.entity.User;
import com.epam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * from users";
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void addUser(User user) {
        String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public User getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void deleteUserById(int id) {
        String sql = "DELETE FROM users WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE users SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql,user.getName(),user.getEmail(), user.getAge(), user.getId());
    }
}
