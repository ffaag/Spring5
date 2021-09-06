package com.it.spring5.factorybean;

import com.it.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZuYingFang
 * @time 2021-07-04 16:13
 */
public class MyBean implements FactoryBean<Course> {

    /*工厂模式，不暴露对象创建的过程*/

    // 定义返回bean的类型
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setCname("卡机");
        return course;
        // 此时虽然配置文件中写的MyBean类型，但是返回的是Course类型
        /*ApplicationContext a = new ClassPathXmlApplicationContext("bean3.xml");
        Course myBean = a.getBean("myBean", Course.class);*/
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    // 工厂bean，用到的是bean3.xml
}
