package com.igeek.ch14.generic.service.impl;

import com.igeek.ch14.generic.dao.IDao;
import com.igeek.ch14.generic.entity.Employee;
import com.igeek.ch14.generic.entity.User;
import com.igeek.ch14.generic.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @Service: 标识服务层(业务层)组件
 */
@Service
public class UserServiceImpl implements IService {

    /**
     * @Autowired  自动装配
     * 1.默认按照类型完成自动装配，一旦容器中出现不止一个匹配的实例时，则会报错
     * 2.required默认为true，则未匹配上直接报错；required为false时，则直接当null处理
     * 3.若按照类型未完成自动装配，则可以根据属性的名称在IOC容器中查询
     */
    @Autowired(required = false)
    private IDao<User> dao;

    @Override
    public boolean regist() {
        System.out.println("UserServiceImpl regist...");
        dao.insert();
        return true;
    }
}
