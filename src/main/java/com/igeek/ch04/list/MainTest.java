package com.igeek.ch04.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:05
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch04_list.xml");

        Person p1 = ac.getBean("p1", Person.class);
        System.out.println("p1 = "+p1);

        PersonInfo p2 = ac.getBean("p2", PersonInfo.class);
        System.out.println("p2 = "+p2);

        Person p3 = ac.getBean("p3", Person.class);
        System.out.println("p3 = "+p3);
    }

}
