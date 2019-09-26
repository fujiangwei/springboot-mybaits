package com.kinson.bat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.kinson.comm.mapper"})
public class BatApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatApplication.class, args);
    }

}
