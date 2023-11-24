package com.yxy.naowen.dao;

import com.yxy.naowen.entity.User;

import java.util.List;

public interface UserDao {

    User findById(Long id);

    void save(User user);

    List<User> findAll();

}