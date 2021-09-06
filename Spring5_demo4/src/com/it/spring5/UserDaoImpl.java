package com.it.spring5;

/**
 * @author ZuYingFang
 * @time 2021-08-06 14:42
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法里面的加法之前执行");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法里面的执行");
        return id;
    }
}
