package com.wyh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wyh.dao")
public class MmeberSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmeberSystemApplication.class, args);
    }

}
