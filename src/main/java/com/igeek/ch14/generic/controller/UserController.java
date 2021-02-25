package com.igeek.ch14.generic.controller;

import com.igeek.ch14.generic.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Controller: 标识表现层组件
 */
@Controller
public class UserController {

    /**
     * @Autowired  自动装配
     * 默认按照类型完成自动装配，一旦容器中出现不止一个匹配的实例时，则会报错
     */
    @Autowired
    private IService service;

    public void regist(){
        System.out.println("UserController regist...");
        service.regist();
    }

}
