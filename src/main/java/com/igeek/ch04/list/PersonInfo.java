package com.igeek.ch04.list;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:31
 */
public class PersonInfo {

    private String name;

    //一对多关联 Car对象
    private Map<String,Car> cars;


    public PersonInfo() {
    }

    public PersonInfo(String name, Map<String, Car> cars) {
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
    public Map<String, Car> getCars() {
        return cars;
    }

    /**
     * 设置
     * @param cars
     */
    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    public String toString() {
        return "PersonInfo{name = " + name + ", cars = " + cars + "}";
    }
}
