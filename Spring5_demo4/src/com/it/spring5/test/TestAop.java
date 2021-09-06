package com.it.spring5.test;

import com.it.spring5.AOP_annotation.User;
import com.it.spring5.AOP_annotation.UserProxy;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;

/**
 * @author ZuYingFang
 * @time 2021-08-06 23:32
 */
public class TestAop {

    @Test
    public void testAop(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        User user = applicationContext.getBean("user", User.class);// 这里用的是被增强的类，而不是代理类
        user.add();
    }
}
