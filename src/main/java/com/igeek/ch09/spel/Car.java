package com.igeek.ch09.spel;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:57
 */
public class Car {

    private String label;
    private double price;
    //计算轮胎的周长  2*PI*r
    private long cl;


    public Car() {
    }

    public Car(String label, double price, long cl) {
        this.label = label;
        this.price = price;
        this.cl = cl;
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
     * @return cl
     */
    public long getCl() {
        return cl;
    }

    /**
     * 设置
     * @param cl
     */
    public void setCl(long cl) {
        this.cl = cl;
    }

    public String toString() {
        return "Car{label = " + label + ", price = " + price + ", cl = " + cl + "}";
    }
}
