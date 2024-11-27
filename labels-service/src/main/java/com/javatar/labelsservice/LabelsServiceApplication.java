package com.javatar.labelsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableDiscoveryClient
@SpringBootApplication
public class LabelsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabelsServiceApplication.class, args);
    }

}
