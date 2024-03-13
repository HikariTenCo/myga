package com.example.myga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.myga.mapper")
public class MygaWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MygaWebApplication.class, args);
    }
}
