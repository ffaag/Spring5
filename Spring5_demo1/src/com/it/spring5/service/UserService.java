package com.it.spring5.service;

import com.it.spring5.dao.UserDao;

/**
 * @author ZuYingFang
 * @time 2021-07-03 19:27
 */
public class UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.......");
        userDao.update();
    }
}
