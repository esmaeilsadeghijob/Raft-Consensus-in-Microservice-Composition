package com.javatar.genresservic;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableRabbit
@EnableDiscoveryClient
@SpringBootApplication
public class GenresServicApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenresServicApplication.class, args);
    }

}
