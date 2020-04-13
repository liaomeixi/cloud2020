package com.atguigu.springcloud.config;

import com.atguigu.springcloud.entity.CommetResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Andy
 * @time: 2020/4/10 11:20
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
