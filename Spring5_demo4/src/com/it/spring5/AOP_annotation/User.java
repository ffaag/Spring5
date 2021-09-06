package com.it.spring5.AOP_annotation;

import org.springframework.stereotype.Component;

/**
 * @author ZuYingFang
 * @time 2021-08-06 20:54
 * 被增强的类
 */


@Component
public class User {

    public void add(){



        System.out.println("本体add........");
        int a=1/0;
    }
}
