package com.igeek.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class UserTest {
    public static void main( String[] args ){

        //1.使用Spring容器之前
        /*User user = new User();
        user.setName("张三");
        System.out.println(user);
        user.eat();*/


        //2.使用Spring容器之后
        //2.1 创建IOC容器对象  ApplicationContext
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.2 可以从容器中直接使用对象
        User user1 = (User) ac.getBean("user1");

        //2.3 使用实例
        System.out.println(user1);
        user1.eat();
    }
}
