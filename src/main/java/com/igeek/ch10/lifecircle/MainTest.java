package com.igeek.ch10.lifecircle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 11:34
 */
public class MainTest {

    public static void main(String[] args) {

        /**
         * Spring IOC 容器对 Bean 的生命周期进行管理的过程
         * 1.创建容器，根据无参构造方法实例化bean，默认单例作用域，有且只会实例化一次
         * 2.进行设置属性值，或者进行对其他bean的引用
         * 3.初始化bean，只会初始化一次
         * 4.使用bean
         * 5.关闭容器，销毁bean
         */


        /**
         * 加上BeanPostProcessor后置处理器，Spring IOC 容器对 Bean 的生命周期进行管理的过程
         * 1.创建容器，根据无参构造方法实例化bean，默认单例作用域，有且只会实例化一次
         * 2.进行设置属性值，或者进行对其他bean的引用
         * 3.BeanPostProcessor后置处理器的  postProcessBeforeInitialization()
         * 4.初始化bean，只会初始化一次
         * 5.BeanPostProcessor后置处理器的  postProcessAfterInitialization()
         * 6.使用bean
         * 7.关闭容器，销毁bean
         */

        //创建容器
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch10_lifecirlce.xml");

        Car car1 = ac.getBean("car123", Car.class);
        System.out.println(car1);

        Person person = ac.getBean("person", Person.class);
        System.out.println(person);

        //关闭容器
        ac.close();
    }

}
