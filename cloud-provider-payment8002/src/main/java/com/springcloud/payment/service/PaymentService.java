package com.springcloud.payment.service;

import com.atguigu.springcloud.entites.Payment;

/**
 * @author killer
 */

public interface PaymentService {
    /**
     * 添加订单信息
     * @param payment 订单对象
     * @return 是否添加成功
     */
    int savePaymentService(Payment payment);

    /**
     * 对应的订单
     * @param paymentId 订单id
     * @return 对应的订单
     */
    Payment getPaymentById(Integer paymentId);
}
