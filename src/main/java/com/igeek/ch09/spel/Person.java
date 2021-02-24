package com.igeek.ch09.spel;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:55
 */
public class Person {

    private String name;
    //根据车的price价格，决定职位，车>=300000.0 金领，否则是白领
    private String title;
    //根据Address的city，并且全部大写输出
    private String city;

    public Person() {
    }

    public Person(String name, String title, String city) {
        this.name = name;
        this.title = title;
        this.city = city;
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
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

    public String toString() {
        return "Person{name = " + name + ", title = " + title + ", city = " + city + "}";
    }
}
