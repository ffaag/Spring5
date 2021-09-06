package com.it.spring5.AOP_xml;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author ZuYingFang
 * @time 2021-08-07 0:06
 */


public class BookProxy {
    public void before(){
        GenericApplicationContext context = new GenericApplicationContext();
    }
}
