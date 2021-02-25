package com.igeek.ch14.generic.test;

import com.igeek.ch14.generic.controller.UserController;
import com.igeek.ch14.generic.dao.impl.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/25 10:54
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_annotation_ch14_generic.xml");

        UserController userController = ac.getBean(UserController.class);
        System.out.println("userController = "+userController);
        userController.regist();
    }

}
