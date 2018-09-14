package com.ssm.tues;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ssm.tues.mapper")
@SpringBootApplication
public class TuesApplication {

    public static void main(String[] args) {
        SpringApplication.run(TuesApplication.class, args);
    }
}
