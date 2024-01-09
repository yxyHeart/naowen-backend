package com.yxy.naowen.controller;

import com.yxy.naowen.common.CommonResult;
import com.yxy.naowen.dto.SetParamsDto;
import com.yxy.naowen.dto.updateUserDto;
import com.yxy.naowen.entity.User;
import com.yxy.naowen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    //用户登录模块
    @GetMapping("/api/register")
    public CommonResult<Map<Object,Object>> register(@RequestParam String name,@RequestParam String password){
        Map<Object,Object> ret = new HashMap<>();
        return CommonResult.success(ret);
    }
    @GetMapping("/api/login")
    public CommonResult<User> login(@RequestParam String name,@RequestParam String password){
        User user = new User("1","yxy","123");
        return CommonResult.success(user);
    }
    @GetMapping("/api/logout")
    public CommonResult<Map<Object,Object>> logout(@RequestParam String id){
        Map<Object,Object> ret = new HashMap<>();
        return CommonResult.success(ret);
    }

    @GetMapping("/api/check")
    public CommonResult<Map<String,Boolean>> check(@RequestParam String id){
        Map<String,Boolean> ret = new HashMap<>();
        ret.put("isValid",true);
        return CommonResult.success(ret);
    }
    //实验模块
    @GetMapping("/api/bcigo")
    public CommonResult<Map<Object,Object>> bcigo(){
        Map<Object,Object> ret = new HashMap<>();

        return CommonResult.success(ret);
    }
    @GetMapping("/api/startPredict")
    public CommonResult<Map<Object,Object>> startPredict(){
        Map<Object,Object> ret = new HashMap<>();

        return CommonResult.success(ret);
    }
    @GetMapping("/api/stopPredict")
    public CommonResult<Map<Object,Object>> stopPredict(){
        Map<Object,Object> ret = new HashMap<>();
        ret.put("name","yxy");
        return CommonResult.success(ret);
    }

    @PostMapping("/api/setParams")
    public CommonResult<Map<String,Boolean>> setParams(@RequestBody SetParamsDto setParamsDto){
        System.out.println(setParamsDto);
        Map<String,Boolean> ret = new HashMap<>();

        return CommonResult.success(ret);
    }

    //表单模块
    @GetMapping("/api/users")
    public  CommonResult<Map<Object,Object>> users(){
        Map<Object,Object> ret = new HashMap<>();
        User user1 = new User("1","yxy","121");
        User user2 = new User("2","gcx","021");
        User user3 = new User("3","xyk","011");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        ret.put("list",list);
        ret.put("total",list.size());
        return CommonResult.success(ret);

    }
    @PutMapping("/api/user")
    public CommonResult<Map<Object,Object>> updateUser(@RequestBody updateUserDto updateUserDto){
        Map<Object,Object> ret = new HashMap<>();
        return CommonResult.success(ret);
    }

    @DeleteMapping("/api/user/{id}")
    public CommonResult<Map<Object,Object>> deleteUser(@PathVariable Long id){
        Map<Object,Object> ret = new HashMap<>();
        return CommonResult.success(ret);
    }

}
