package com.igeek.ch13.annotation.controller;

import com.igeek.ch13.annotation.service.IService;
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
     * @Autowired 自动装配
     * 1.按照类型自动装配，当IOC容器中只有一个符合条件的bean时，可以使用此方式
     * 2.按照名称自动装配，当IOC容器中不止一个符合条件的bean时，为了避免出现错误，可以使用此方式
     *  此时名称要么与注解中value值一致；要么未指定value用它的默认命名策略。
     *
     * @Autowired(required = false)
     *  required属性默认值为true：当在IOC容器中进行自动装配时，必须找到匹配的bean实例，若未找到，直接报错。
     *  required属性是false：当在IOC容器中进行自动装配时，未找到匹配的bean实例，不会直接报错，只会显示null值
     */
    @Autowired
    private IService service;

    /**
     * @Autowired 默认按照类型自动装配，从IOC容器中查找唯一与之类型匹配的；若不唯一，则按照属性名称，从IOC容器中查找与之匹配bean。
     *
     * @Qualifier 默认按照名称自动装配。
     *
     * @Resource 直接通过type属性，指定按照类型自动装配；直接通过name属性，按照名称自动装配。可以同时指定了name和type。若未指定name或者type，则默认按照name实现装配。
     */
    @Resource(name = "strs")
    private List strs;

    public void regist(){
        System.out.println("UserController regist...");
        service.regist();
        System.out.println("strs = "+strs);
    }

}
