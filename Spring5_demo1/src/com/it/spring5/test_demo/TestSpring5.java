package com.it.spring5.test_demo;

import com.it.spring5.Book;
import com.it.spring5.User;
import com.it.spring5.bean.Emp;
import com.it.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZuYingFang
 * @time 2021-07-03 14:19
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        // 1 加载配置文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("bean1.xml");
        // 文件地址为src下面直接可省略src/，类路径
        // 用FileSystemXmlApplicationContext 就是系统的绝对路径

        // 2 获取配置的对象
        User user = applicationContext.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }


    @Test
    public void testBook(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = applicationContext.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void testBook2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = applicationContext.getBean("book1", Book.class);
        System.out.println(book);
    }

    @Test
    public void testAdd1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testPrint(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
