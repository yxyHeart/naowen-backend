package com.yxy.naowen.dao.impl;

import com.yxy.naowen.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserDaoImplTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    void findById() {

    }
}