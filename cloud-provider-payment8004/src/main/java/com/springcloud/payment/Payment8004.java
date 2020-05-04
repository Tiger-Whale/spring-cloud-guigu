package com.springcloud.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Killer
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment8004 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8004.class,args);
    }
}
