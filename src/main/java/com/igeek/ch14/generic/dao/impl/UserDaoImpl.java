package com.igeek.ch14.generic.dao.impl;

import com.igeek.ch14.generic.dao.IDao;
import com.igeek.ch14.generic.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Repository
 * 1.标识持久层  dao层组件
 * 2.命名策略：会将类名首字母小写，即userDaoImpl作为在IOC容器中的唯一标识
 * 3.或者，可以指定value = "userDao"，即userDao作为在IOC容器中的唯一标识
 */
@Repository(value = "userDao")
public class UserDaoImpl implements IDao<User> {
    @Autowired(required = false)
    private User user;

    @Override
    public void insert() {
        System.out.println("UserDaoImpl insert...");
        System.out.println(user);
    }
}
