package com.tv.living;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan({"com.tv.*.mapper"})
@ComponentScan({"com.tv.living"})
@SpringBootApplication
public class ApiApplication {



    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
