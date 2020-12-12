package com.edh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TeacherProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherProviderApplication.class,args);
    }
}
