package com.adelaide.disneymall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DisneymallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneymallCouponApplication.class, args);
    }

}
