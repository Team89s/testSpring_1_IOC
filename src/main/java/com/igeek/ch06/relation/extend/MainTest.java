package com.igeek.ch06.relation.extend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 9:25
 */
public class MainTest {

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch06_relation.xml");
        //Address addr1 = ac.getBean("addr1", Address.class);
        //System.out.println("addr1 = "+addr1);

        Address addr2 = ac.getBean("addr2", Address.class);
        System.out.println("addr2 = "+addr2);
    }

}
