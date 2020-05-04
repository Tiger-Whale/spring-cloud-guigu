package com.springcloud.payment.service.impl;

import com.atguigu.springcloud.entites.Payment;
import com.springcloud.payment.dao.PaymentDao;
import com.springcloud.payment.service.PaymentService;
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
