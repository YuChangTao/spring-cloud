package com.yt.springcloud.service.impl;

import com.yt.springcloud.dao.PaymentDao;
import com.yt.springcloud.service.PaymentService;
import com.yt.springcloud.vo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yutyi
 * @date 2020/12/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
