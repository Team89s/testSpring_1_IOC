package com.igeek.ch06.relation.depend;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:01
 */
public class Car {

    private String label;
    private double price;
    private String color;


    public Car() {
        System.out.println("Car()");
    }

    public Car(String label, double price, String color) {
        this.label = label;
        this.price = price;
        this.color = color;
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

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Car{label = " + label + ", price = " + price + ", color = " + color + "}";
    }
}
