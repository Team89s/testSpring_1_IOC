package com.igeek.ch05.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 9:10
 */
public class MainTest {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch05_autowire.xml");
        Person p = ac.getBean("p", Person.class);
        System.out.println(p);
    }

}
