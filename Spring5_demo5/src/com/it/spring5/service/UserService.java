package com.it.spring5.service;

import com.it.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ZuYingFang
 * @time 2021-08-07 10:51
 */

@Service
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ,timeout = 10, readOnly = true)
// 事务的注解，即所有的方法要么执行，要么里面的都不执行，可放在类上面，或者方法上面
// mysql默认的隔离级别就是上面这个，即只能虚度读，不可脏读，可重复读
// 超时时间默认为-1，即不超时，以秒为单位，readonly默认为false，rollback回滚设置出现哪些异常进行回滚，还有一个 norollback
public class UserService {

    /*3、在 service 类上面（或者 service 类里面方法上面）添加事务注解
    （1）@Transactional，这个注解添加到类上面，也可以添加方法上面
    （2）如果把这个注解添加类上面，这个类里面所有的方法都添加事务
    （3）如果把这个注解添加方法上面，为这个方法添加事务*/

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;


    public void accountMoney(){
        userDao.reduceMoney();

        int i = 10/0;

        userDao.addMoney();
    }
}
