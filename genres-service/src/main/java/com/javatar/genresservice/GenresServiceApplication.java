package com.javatar.genresservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GenresServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenresServiceApplication.class, args);
    }

}
