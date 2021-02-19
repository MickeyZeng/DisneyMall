package com.adelaide.disneymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisneymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneymallMemberApplication.class, args);
    }

}
