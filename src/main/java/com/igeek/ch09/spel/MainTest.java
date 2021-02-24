package com.igeek.ch09.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:58
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch09_spel.xml");
        Person p = ac.getBean("p", Person.class);
        System.out.println(p);

        Car car = ac.getBean("car", Car.class);
        System.out.println(car);
    }

}
