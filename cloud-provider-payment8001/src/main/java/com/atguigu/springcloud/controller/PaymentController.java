package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommetResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Andy
 * @time: 2020/4/10 10:27
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value="/payment/create")
    public CommetResult create(@RequestBody Payment payment){
        boolean result=paymentService.save(payment);
        if(result){
            return new CommetResult(200,"插入数据库成功",result);
        }else{
            return new CommetResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value="/payment/get/{id}")
    public CommetResult getPaymentById(@PathVariable("id")Integer id){
        Payment payment=paymentService.getById(id);
        if(payment!=null){
            return new CommetResult(200,"查询成功",payment);
        }else{
            return new CommetResult(444,"没有对应记录",null);
        }
    }
}
