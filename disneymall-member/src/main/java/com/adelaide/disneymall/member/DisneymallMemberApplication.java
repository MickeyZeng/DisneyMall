package com.adelaide.disneymall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
* 引入远程其他服务
 * 1。 调用Open-feign
 * 2。 写一个 告诉SpringCloud需要调用远程服务
 *  2.1 声明每一个借口的调用那个请求
 * 3。开启功能
* */
@EnableFeignClients(basePackages = "com.adelaide.disneymall.member.feign" )
@SpringBootApplication
@EnableDiscoveryClient
public class DisneymallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(DisneymallMemberApplication.class, args);
    }

}
