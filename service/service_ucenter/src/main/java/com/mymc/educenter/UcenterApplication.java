package com.mymc.educenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.mymc"})
@MapperScan("com.mymc.educenter.mapper")
public class UcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.mymc.educenter.UcenterApplication.class, args);
    }
}
