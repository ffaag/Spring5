package com.it.spring5.test;

import com.it.spring5.config.SpringConfig;
import com.it.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZuYingFang
 * @time 2021-08-03 11:52
 */
public class Test1 {

    @Test
    public void testService(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        // 如果完全注解开发，那么这里不是ClassPathXmlApplicationContext("bean1.xml")，
        // 而是AnnotationConfigApplicationContext(SpringConfig.class)
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
