package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: Andy
 * @time: 2020/4/9 17:32
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommetResult<T> {
    private Integer code;
    private String message;
    private T data;
    public CommetResult(Integer code,String message){
        this(code,message,null);
    }
}
