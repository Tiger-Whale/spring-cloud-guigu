package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommentResult;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author killer
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentServiceImpl paymentService;

    @ResponseBody
    @RequestMapping("save")
    public CommentResult savePaymentController(@RequestBody Payment payment){
        Integer savePayment = paymentService.savePaymentService(payment);
        return new CommentResult(200,"success"+serverPort,savePayment);
    }

    @GetMapping("/getPaymentById/{paymentId}")
    public CommentResult getPaymentById(@PathVariable("paymentId") Integer paymentId){
        log.info("测试");
        Payment payment = paymentService.getPaymentById(paymentId);
        return new CommentResult(200,"success"+serverPort,payment);
    }
}
