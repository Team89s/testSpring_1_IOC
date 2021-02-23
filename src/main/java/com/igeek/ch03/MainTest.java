package com.igeek.ch03;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 1.通过ApplicationContext，创建IOC容器对象
 * 第一步：实例化 Person()
 * 第二步：赋值 setName(String) setAge(int)
 *
 * 2.BeanFactory是ApplicationContext的父接口
 * 第一步：实例化 Person()
 * 第二步：赋值 setName(String) setAge(int)
 */
public class MainTest {

    public static void main(String[] args) {

        //1.创建IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch03.xml");

        //2.获得实例
        Person p1 = ac.getBean("p1", Person.class);
        System.out.println(p1);

        Person p2 = ac.getBean("p2", Person.class);
        System.out.println(p2);

        //刷新容器
        //ac.refresh();

        //关闭容器
        //ac.close();
    }

}
