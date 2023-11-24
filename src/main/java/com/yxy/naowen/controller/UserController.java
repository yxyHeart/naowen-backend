package com.yxy.naowen.controller;

import com.yxy.naowen.common.Result;
import com.yxy.naowen.entity.User;
import com.yxy.naowen.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public User findById(){
        return userService.findById(123L);
    }
    @GetMapping("/api/status")
    public Map<String,Object> Status(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code",0 );
            put("data", "not running");
        }};
        return ret;
    }
    @GetMapping(path = "/api/getAllUsers", produces = {MediaType.APPLICATION_OCTET_STREAM_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Result findAll(){
        return Result.success(userService.findAll());
    }

    @GetMapping("/api/startRecord")
    public Map<String,Object> startRecord(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", "ok!");
        }};
        return ret;
    }
    @GetMapping("/api/stopRecord")
    public Map<String,Object> stopRecord(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", "1");
        }};
        return ret;
    }
    @GetMapping("/api/startPredict")
    public Map<String,Object> startPredict(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", "ok!");
        }};
        return ret;
    }

    @GetMapping("/api/startValid")
    public Map<String,Object> startValid(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code",  0);
            put("data", "ok!");
        }};
        return ret;
    }

    @GetMapping("/api/bcigo")
    public Map<String,Object> bciGo(){
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", "ok!");
        }};
        return ret;
    }
    @GetMapping("/api/getdata18")
    public Map<String,Object> getdata18(){
        double[][] arr = new double[18][150];
        for(int i =0;i<18;++i){
            for(int j =0;j<150;++j){
                arr[i][j] = i + (Math.random() -0.5);
            }
        }
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", arr);
        }};
        return ret;
    }
    @GetMapping("/api/stopPredict")
    public Map<String,Object> stopPredict(){
        double[] arr = new double[16];
        for(int i =0;i<16;++i){
            arr[i] = Math.random()/2;
        }
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", arr);
        }};
        return ret;
    }
    @GetMapping("/api/stopValid")
    public Map<String,Object> stopValid(){

        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", 1);
        }};
        return ret;
    }

    @GetMapping("/api/table")
    public Map<String,Object> getTableData(){
        List<HashMap> list = new ArrayList<>();
        HashMap<Object,Object> map1 = new HashMap<>();

        map1.put("createTime","1982-01-25 12:44:18");
        map1.put("email","g.and@liqv.gp");
        map1.put("id","2");
        map1.put("phone","17254767969");
        map1.put("roles","editor");
        map1.put("status",true);
        map1.put("username","yxy");
        for(int i =0;i<50;i++){
            list.add(map1);
        }
        HashMap<Object,Object> data = new HashMap<>();
        data.put("list",list);
        data.put("total",50);
        Map<String,Object> ret = new HashMap<>() {{
            put("code", 0);
            put("data", data);
        }};
        return ret;
    }


}
