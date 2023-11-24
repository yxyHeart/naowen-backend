package com.yxy.naowen.service;

import com.yxy.naowen.entity.User;

import java.util.List;

public interface UserService {



    User findById(Long id);

    void save(User user);

    List<User> findAll();

}
