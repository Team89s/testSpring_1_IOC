package com.igeek.ch12.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @version 1.0
 * @Description FactoryBean 工厂Bean
 * @Author chenmin
 * @Date 2021/2/25 10:25
 */
public class MyFactoryBean implements FactoryBean<Car> {

    /**
     * 当前方法才是真正返回的实例
     * @return
     * @throws Exception
     */
    @Override
    public Car getObject() throws Exception {
        return new Car("smart","红色");
    }

    /**
     * 返回实例的类类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * 告知返回的实例是否是单例 ，若是true则返回单例；若是false每次获取都是不同的实例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }

}
