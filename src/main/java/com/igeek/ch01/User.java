package com.igeek.ch01;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 10:30
 */
public class User {

    private String name;

    public User() {
        System.out.println("User()");
    }

    public User(String name) {
        System.out.println("User(String)");
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        System.out.println("getName()");
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        System.out.println("setName(String)");
        this.name = name;
    }

    public String toString() {
        return "User{name = " + name + "}";
    }

    public void eat(){
        System.out.println(this.name+"正在吃饭...");
    }
}
