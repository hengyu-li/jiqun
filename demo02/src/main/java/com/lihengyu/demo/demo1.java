package com.lihengyu.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class demo1 {

    public static void main(String[] args) {
        System.out.println("启动注册中心22222");
        SpringApplication.run(demo1.class,args);
    }
}
