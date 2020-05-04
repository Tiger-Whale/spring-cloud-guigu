package com.springcloud.payment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Killer
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/consul")
    public String paymentConsul(){
        return serverPort+"paymentConsul"+ UUID.randomUUID().toString();
    }
}
