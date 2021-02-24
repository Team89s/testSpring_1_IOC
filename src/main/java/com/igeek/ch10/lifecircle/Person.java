package com.igeek.ch10.lifecircle;

import com.igeek.ch06.relation.depend.Car;
import com.igeek.ch06.relation.extend.Address;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 9:20
 */
public class Person {

    private String name;

    public Person() {
        System.out.println("Person()");
    }

    public Person(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Person{name = " + name + "}";
    }
}
