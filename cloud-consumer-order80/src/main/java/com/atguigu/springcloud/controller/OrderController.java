package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entites.CommentResult;
import com.atguigu.springcloud.entites.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author killer
 */

@RestController
@RequestMapping("/consumer")
public class OrderController {

    private final static String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/payment/save")
    public CommentResult save(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/save",payment,CommentResult.class);
    }

    @ResponseBody
    @GetMapping("/payment/getPaymentId/{paymentId}")
    public CommentResult getPaymentById(@PathVariable("paymentId") Integer paymentId){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/getPaymentById/"+paymentId,CommentResult.class);
    }
}
