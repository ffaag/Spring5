package com.it.spring5.test;

import com.it.spring5.autowire.Emp;
import com.it.spring5.collectiontype.Student;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZuYingFang
 * @time 2021-07-04 11:05
 */
public class TestSpring5 {

    @Test
    public void test1(){
        ApplicationContext bean1 = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = bean1.getBean("student", Student.class);
        System.out.println(student);
    }



    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
