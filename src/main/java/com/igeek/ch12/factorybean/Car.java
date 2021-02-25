package com.igeek.ch12.factorybean;

/**
 * @version 1.0
 * @Description 普通bean
 * @Author chenmin
 * @Date 2021/2/25 10:22
 */
public class Car {

    private String label;
    private String color;

    public Car() {
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
