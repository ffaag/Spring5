package com.it.spring5.test;

import com.it.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * @author ZuYingFang
 * @time 2021-08-07 13:27
 */
public class TestBook {

    //PlatformTransactionManager

    @Test
    public void testAccount(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.accountMoney();

    }
}
