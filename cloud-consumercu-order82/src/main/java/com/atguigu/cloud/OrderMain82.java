package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Killer
 */

@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain82 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain82.class,args);
    }
}
