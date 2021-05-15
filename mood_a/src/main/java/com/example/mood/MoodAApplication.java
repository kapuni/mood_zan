package com.example.mood;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mood.dao")
public class MoodAApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoodAApplication.class, args);
    }

}
