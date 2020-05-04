package com.atguigu.springcloud;

import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.impl.PaymentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentMain8001Test {

    @Autowired
    private PaymentServiceImpl paymentService;

    @Test
    public void test(){
        Payment payment = Payment.builder().serial("123").build();
        System.out.println(payment);
        System.out.println(paymentService.savePaymentService(payment));
    }
}
