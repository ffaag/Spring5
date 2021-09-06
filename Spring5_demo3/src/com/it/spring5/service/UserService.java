package com.it.spring5.service;

import com.it.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ZuYingFang
 * @time 2021-08-03 11:56
 */

/*等价于在配置文件中写<bean id="" class="">没有进行注入，只是创建对象
这里的value就是bean里面的id，可以不写，默认为这个类的类名，首字母小写，如直接写@Service*/
@Service(value = "userService")
public class UserService {


    /*（1）@Autowired：根据属性类型进行自动装配
    第一步 把 service 和 dao 对象创建，在 service 和 dao 类添加创建对象注解
    第二步 在 service 注入 dao 对象，在 service 类添加 dao 类型属性，在属性上面使用注解，不需要set方法*/
    @Autowired
    private UserDao userDao;


    /*（2）@Qualifier：根据名称进行注入
           这个@Qualifier 注解的使用，和上面@Autowired 一起使用
           因为上面是将字类的对象给接口对象，但是接口会有很多的实现类，所以只按照类型不知道给哪个接口
           因此我们首先按照类型，然后按照名称，这样就完美了*/
    @Autowired
    @Qualifier(value = "userImpl1")
    private UserDao userDao1;


    /*（3）@Resource：可以根据类型注入，可以根据名称注入，不常用*/
    @Resource(name = "userImpl1")
    private UserDao userDao2;

    /*（4）@Value：注入普通类型属性，上面几个都是注入对象*/
    @Value(value = "abc")
    private String name;




    public void add(){
        System.out.println("注解方式" + name);
        userDao.add();
    }
}
