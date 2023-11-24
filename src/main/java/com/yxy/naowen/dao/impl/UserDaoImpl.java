package com.yxy.naowen.dao.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yxy.naowen.dao.UserDao;
import com.yxy.naowen.entity.User;
import com.yxy.naowen.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Long id) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("id", 123L);

        return this.userMapper.selectOne(userQueryWrapper);
    }
    @Override
    public void save(User user) {
        this.userMapper.insert(new User(123L, "yxy"));
    }

    @Override
    public List<User> findAll(){
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        return this.userMapper.selectList(userQueryWrapper);
    }
}
