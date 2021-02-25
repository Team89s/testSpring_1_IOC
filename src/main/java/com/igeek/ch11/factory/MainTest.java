package com.igeek.ch11.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/25 9:40
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch11_factory.xml");

        Car car1 = ac.getBean("car1", Car.class);
        System.out.println("car1 = "+car1);

        Car car2 = ac.getBean("car2", Car.class);
        System.out.println("car2 = "+car2);

        Car car3 = ac.getBean("car3", Car.class);
        System.out.println("car3 = "+car3);
    }

}
