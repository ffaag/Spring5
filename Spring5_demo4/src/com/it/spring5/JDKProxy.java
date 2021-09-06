package com.it.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ZuYingFang
 * @time 2021-08-06 14:43
 * 这是JDK动态代理的底层实现原理，看看就好，不需要过分的去研究
 */
public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类的代理对象
        Class[] interfaces = {UserDao.class};

        UserDao userDao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new userDaoProxy(new UserDaoImpl()));
        int add = userDao.add(1, 2);
        System.out.println(add);

    }
}


// 创建代理对象代码
class userDaoProxy implements InvocationHandler{

    Object obj;

    // 把创建是谁的代理对象，把这个谁传递过来
    // 一般用有参构造函数来传递
    public userDaoProxy(Object obj) {
        this.obj = obj;
    }


    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前要增加的操作
        System.out.println("方法执行之前..." + method.getName() + "传递的参数" + Arrays.toString(args));

        // 指定要增强的方法要执行的操作
        Object res = method.invoke(obj, args);

        // 方法之后要增加的操作
        System.out.println("方法执行之后..." + obj);

        return res;
    }
}