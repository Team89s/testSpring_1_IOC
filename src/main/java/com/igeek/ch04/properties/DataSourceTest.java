package com.igeek.ch04.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.DriverManager;
import java.util.Properties;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/23 16:36
 */
public class DataSourceTest {

    private Properties props;

    public DataSourceTest() {
    }

    public DataSourceTest(Properties props) {
        this.props = props;
    }

    /**
     * 获取
     * @return props
     */
    public Properties getProps() {
        return props;
    }

    /**
     * 设置
     * @param props
     */
    public void setProps(Properties props) {
        this.props = props;
    }

    public String toString() {
        return "DataSourceTest{props = " + props + "}";
    }

    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch04_list.xml");

        DataSourceTest test = ac.getBean("test",DataSourceTest.class);
        Properties props = test.props;
        String user = props.getProperty("user");
        System.out.println(user);
    }
}
