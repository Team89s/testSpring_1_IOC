package com.igeek.ch06.relation.extend;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 9:20
 */
public class Address {

    private String city;
    private String street;

    public Address() {
        System.out.println("Address()");
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    /**
     * 获取
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     * @return street
     */
    public String getStreet() {
        return street;
    }

    /**
     * 设置
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    public String toString() {
        return "Address{city = " + city + ", street = " + street + "}";
    }
}
