package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
}
