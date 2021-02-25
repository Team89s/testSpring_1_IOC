package com.igeek.ch07.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:28
 */
public class MainTest {

    public static void main(String[] args) {

        /**
         * singleton 单例作用域 和 prototype 原型作用域
         * 1.singleton ， 确保每次通过getBean获得的实例都是同一个
         * prototype ， 每次通过getBean获得的实例都是不同的
         *
         * 2.singleton ， 随着创建容器，而实例化bean
         * prototype ， 随着调用执行getBean()方法时，实例化bean
         */
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch07_scope.xml");

        Car car1 = ac.getBean("car", Car.class);
        Car car2 = ac.getBean("car", Car.class);
        System.out.println(car1 == car2);

        System.out.println("car1 = "+car1);
        System.out.println("car2 = "+car2);
    }

}
