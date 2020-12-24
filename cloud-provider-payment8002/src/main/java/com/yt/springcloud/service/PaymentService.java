package com.yt.springcloud.service;

import com.yt.springcloud.vo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yutyi
 * @date 2020/12/22
 */
public interface PaymentService {

    int create(Payment payment); //写

    Payment getPaymentById(@Param("id") Long id);  //读取
}
