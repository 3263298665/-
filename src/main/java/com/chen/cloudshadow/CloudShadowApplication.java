package com.chen.cloudshadow;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chen.cloudshadow.mapper")
public class CloudShadowApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudShadowApplication.class, args);
    }

}
