package com.edh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.edh.dao")
public class BasicProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicProducerApplication.class,args);
    }
}
