package com.yxy.naowen.service.impl;

import com.yxy.naowen.dao.UserDao;
import com.yxy.naowen.entity.User;
import com.yxy.naowen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }


    @Override
    public void save(User user) {
        return ;
    }

    @Override
    public List<User> findAll(){
        return userDao.findAll();
    }
}