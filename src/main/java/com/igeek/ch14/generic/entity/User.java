package com.igeek.ch14.generic.entity;

import org.springframework.stereotype.Component;

/**
 * @Component
 * 1.基本注解, 标识了一个受 Spring 管理的组件
 * 2.命名策略：会将类名首字母小写，即user作为在IOC容器中的唯一标识
 */
@Component
public class User {

    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

}
