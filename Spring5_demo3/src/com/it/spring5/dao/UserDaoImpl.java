package com.it.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ZuYingFang
 * @time 2021-08-03 13:37
 */

@Repository(value = "userImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("userdao ");
    }
}
