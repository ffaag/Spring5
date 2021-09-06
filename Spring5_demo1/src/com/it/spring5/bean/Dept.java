package com.it.spring5.bean;

/**
 * @author ZuYingFang
 * @time 2021-07-04 9:00
 * 部门类，与员工类的关系时是一对多，这里是学习内部bean，即确定关系
 */
public class Dept {

    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
