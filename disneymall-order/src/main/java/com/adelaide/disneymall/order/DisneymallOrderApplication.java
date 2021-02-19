package com.adelaide.disneymall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisneymallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneymallOrderApplication.class, args);
    }

}
