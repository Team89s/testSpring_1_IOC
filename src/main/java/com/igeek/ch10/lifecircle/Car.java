package com.igeek.ch10.lifecircle;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 11:30
 */
public class Car {

    private String label;
    private double price;

    public Car() {
        System.out.println("实例化Car()");
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
        System.out.println("setXxx()");
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

    public String toString() {
        return "Car{label = " + label + ", price = " + price + "}";
    }

    //初始化方法
    public void initCar(){
        System.out.println("初始化Car init()");
    }

    //销毁方法
    public void destroyCar(){
        System.out.println("销毁Car destroy()");
    }
}
