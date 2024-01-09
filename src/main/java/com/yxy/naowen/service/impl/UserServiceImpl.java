package com.yxy.naowen.service.impl;

import com.yxy.naowen.entity.User;
import com.yxy.naowen.mapper.UserMapper;
import com.yxy.naowen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


}