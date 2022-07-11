package com.ec.xspx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ec.xspx.mapper")
@SpringBootApplication
public class XspxApplication {

    public static void main(String[] args) {
        SpringApplication.run(XspxApplication.class, args);
    }

}
