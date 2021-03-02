package com.adelaide.disneymall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合MyBaties
 * 1. 导入依赖
 * 2. 配置: a.数据源
 *              1. 导入数据库驱动
 *              2. 在Application.yml配置数据相关信息
 *         b.MyBaties-plus相关信息
 *              1. 使用MapperScan
 *              2. Mybaties的映射SQL文件
 */

/**
 *
 * 使用逻辑删除
 * 在Application.yml配置全局的逻辑删除的配置
 * 加上逻辑删除的注解@Logical
 *
 * */

@MapperScan("com.adelaide.disneymall.product.dao")
@SpringBootApplication
@EnableDiscoveryClient
public class DisneymallProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(DisneymallProductApplication.class, args);
    }

}
