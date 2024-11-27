package com.javatar.yearsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class YearsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(YearsServiceApplication.class, args);
    }

}
