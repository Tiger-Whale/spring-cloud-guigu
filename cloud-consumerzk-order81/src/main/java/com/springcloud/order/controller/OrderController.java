package com.springcloud.order.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author killer
 */

@RestController
@RequestMapping("/consumer")
public class OrderController {

    private final static String PAYMENT_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/payment/zk")
    public String save(){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/zk",String.class);
    }
}
