package com.igeek.ch04.bean;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:01
 */
public class Person {

    private String name;
    //一对一关联 Car对象
    private Car car;

    public Person() {
    }

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
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

    /**
     * 获取
     * @return car
     */
    public Car getCar() {
        return car;
    }

    /**
     * 设置
     * @param car
     */
    public void setCar(Car car) {
        this.car = car;
    }

    public String toString() {
        return "Person{name = " + name + ", car = " + car + "}";
    }
}
