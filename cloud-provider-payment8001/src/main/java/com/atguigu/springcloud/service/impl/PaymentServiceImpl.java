package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author killer
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int savePaymentService(Payment payment) {
        return paymentDao.savePayment(payment);
    }

    @Override
    public Payment getPaymentById(Integer paymentId) {
        return paymentDao.getPaymentListById(paymentId);
    }
}
