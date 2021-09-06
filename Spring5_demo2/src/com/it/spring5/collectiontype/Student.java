package com.it.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author ZuYingFang
 * @time 2021-07-04 10:46
 */
public class Student {

    // 1 数组类型属性
    private String[] course;

    // 2 list类型属性
    private List<String> list;

    // 3 map类型属性
    private Map<String,String> map;

    // 4 set类型属性
    private Set<String> sets;

    // 5 list类型属性，但是里面放置的不是普通的类型数据，而是另一个类的对象类型
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + Arrays.toString(course) +
                ", list=" + list +
                ", map=" + map +
                ", sets=" + sets +
                '}';
    }
}
