package com.yxy.naowen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.yxy.naowen.mapper")
@SpringBootApplication
public class NaowenApplication {

    public static void main(String[] args) {
        SpringApplication.run(NaowenApplication.class, args);
    }

}
