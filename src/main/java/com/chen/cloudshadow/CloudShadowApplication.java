package com.chen.cloudshadow;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chen.cloudshadow.mapper")
@Slf4j
public class CloudShadowApplication {

    public static void main(String[] args) {

        SpringApplication.run(CloudShadowApplication.class, args);
    }

}
