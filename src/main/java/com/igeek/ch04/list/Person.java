package com.igeek.ch04.list;

import java.util.List;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:01
 */
public class Person {

    private String name;

    //一对多关联 Car对象
    private List<Car> cars;

    public Person() {
    }

    public Person(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
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
     * @return cars
     */
    public List<Car> getCars() {
        return cars;
    }

    /**
     * 设置
     * @param cars
     */
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String toString() {
        return "Person{name = " + name + ", cars = " + cars + "}";
    }
}
