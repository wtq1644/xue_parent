package com.mymc.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.mymc"})
@EnableDiscoveryClient  //nacos注册
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.mymc.oss.OssApplication.class, args);
    }
}
