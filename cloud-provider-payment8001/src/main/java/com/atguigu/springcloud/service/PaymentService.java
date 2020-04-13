package com.atguigu.springcloud.service;

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entity.Payment;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Andy
 * @time: 2020/4/10 10:23
 */
@Service
public class PaymentService extends ServiceImpl<PaymentDao, Payment> {

}
