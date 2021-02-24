package com.igeek.ch07.scope;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:27
 */
public class Car {

    private String label;
    private double price;

    public Car() {
    }

    public Car(String label, double price) {
        this.label = label;
        this.price = price;
    }

    /**
     * 获取
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置
     * @param label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

}
