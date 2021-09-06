package com.it.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ZuYingFang
 * @time 2021-08-07 10:53
 */

@Repository
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update user_account set money = money+? where username = ?";
        jdbcTemplate.update(sql, 100, "lucy");
    }

    @Override
    public void reduceMoney() {
        String sql = "update user_account set money = money-? where username = ?";
        jdbcTemplate.update(sql, 100, "mary");
    }
}
