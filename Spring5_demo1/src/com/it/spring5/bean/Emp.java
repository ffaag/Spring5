package com.it.spring5.bean;

/**
 * @author ZuYingFang
 * @time 2021-07-04 9:01
 * 员工类，与部门类的关系是一对多关系
 */
public class Emp {

    private String ename;
    private String gender;
    private Dept dept;//员工所属的部门

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
