package com.igeek.ch06.relation.depend;

import com.igeek.ch06.relation.extend.Address;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 9:20
 */
public class Person {

    private String name;

    private Address address;
    private Car car;

    public Person() {
        System.out.println("Person()");
    }

    public Person(String name, Address address, Car car) {
        this.name = name;
        this.address = address;
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
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
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
        return "Person{name = " + name + ", address = " + address + ", car = " + car + "}";
    }
}
