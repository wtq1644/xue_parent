package com.mymc.oss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = {"com.mymc"})
public class OssApplication {

    public static void main(String[] args) {
        SpringApplication.run(com.mymc.oss.OssApplication.class, args);
    }
}
