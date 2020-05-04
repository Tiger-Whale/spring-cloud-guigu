package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entites.Payment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Killer
 */
@Mapper
public interface PaymentDao {

    /**
     * 添加支付信息
     * @param payment 订单对象
     * @return 是否添加成功
     */
    @Insert("insert into payment(serial) value (#{serial})")
    int savePayment(Payment payment);

    /**
     * 删除支付信息
     * @param id 订单id
     * @return 是否添加成功
     */
    @Delete("delete from payment where id = #{id}")
    boolean deletePayment(@Param("id") Integer id);

    /**
     * 更新支付信息
     * @param payment 订单对象
     * @return 是否添加成功
     */
    @Update("update payment set serial = #{serial} where id = #{id}")
    boolean updatePayment(Payment payment);

    /**
     * 获取指定订单信息
     * @param id 订单id
     * @return 获取指定订单信息
     */
    @Select("select * from payment where id = #{id}")
    Payment getPaymentListById(@Param("id") Integer id);
}
