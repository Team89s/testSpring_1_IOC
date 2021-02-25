package com.igeek.ch12.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/25 10:22
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch12_factorybean.xml");

        Car car1 = ac.getBean("car1", Car.class);
        System.out.println("car1 = "+car1);

        Car car2 = ac.getBean("car2", Car.class);
        System.out.println("car2 = "+car2);
    }

}
