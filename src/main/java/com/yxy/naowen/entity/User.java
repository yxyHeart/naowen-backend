package com.yxy.naowen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("users")
public class User {
    private String id;
    private String name;
    private String password;


    public User(String _id, String _name,String _password) {
        this.id = _id;
        this.name = _name;
        this.password = _password;
    }
}
