package com.igeek.ch10.lifecircle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @version 1.0
 * @Description BeanPostProcessor Bean的后置处理器
 * @Author chenmin
 * @Date 2021/2/24 11:44
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    /**
     * 在初始化方法之前
     * @param bean      正在执行的bean实例
     * @param beanName  IOC容器中配置的bean的id
     * @return 可以是任意的bean实例
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor Before..."+bean+" : "+beanName);
        if(bean instanceof Car){
            Car car = (Car)bean;
            car.setLabel("奥迪");
            return car;
        }
        return bean;
    }

    /**
     * 在初始化方法之后
     * @param bean      正在执行的bean实例
     * @param beanName  正在执行的bean实例的id
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor After..."+bean+" : "+beanName);
        return bean;
    }
}
