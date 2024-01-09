package com.yxy.naowen.controller;

import com.yxy.naowen.common.CommonResult;
import com.yxy.naowen.entity.User;
import com.yxy.naowen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/api/login")
    public CommonResult<User> login(){
        User user = new User("1","yxy","123");
        return CommonResult.success(user);
    }



}
