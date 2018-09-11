package com.musingtec;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.musingtec.mapper")
@EnableEurekaClient
public class ShopProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopProviderApplication.class, args);
    }
}
