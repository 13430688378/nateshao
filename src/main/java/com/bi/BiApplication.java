package com.bi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bi.mapper")
public class BiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiApplication.class, args);
    }

}
