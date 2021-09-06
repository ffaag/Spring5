package com.it.spring5.AOP_xml;

import org.springframework.stereotype.Component;

/**
 * @author ZuYingFang
 * @time 2021-08-07 0:06
 * 这个是用xml方式来进行切入，用到的配置文件为bean2.xml
 */


public class Book {
    public void buy(){
        System.out.println("buy......");
    }
}
