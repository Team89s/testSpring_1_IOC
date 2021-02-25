package com.igeek.ch11.factory;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/25 9:32
 */
public class Car {

    private String label;
    private String color;

    public Car() {
        System.out.println("Car()");
    }

    public Car(String label, String color) {
        this.label = label;
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
        System.out.println("Car()");
        this.label = label;
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
        return "Car{label = " + label + ", color = " + color + "}";
    }
}
