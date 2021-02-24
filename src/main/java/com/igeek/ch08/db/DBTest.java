package com.igeek.ch08.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @version 1.0
 * @Description TODO
 * @Author chenmin
 * @Date 2021/2/24 10:39
 */
public class DBTest {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring_xml_ch08_db.xml");
        ComboPooledDataSource dataSource = ac.getBean("dataSource", ComboPooledDataSource.class);
        Connection conn = dataSource.getConnection();
        String sql = "select * from user where id = ?";
        PreparedStatement ppst = conn.prepareStatement(sql);
        ppst.setInt(1,10);
        ResultSet rs = ppst.executeQuery();
        while (rs.next()){
            System.out.println("name="+rs.getString(2));
        }
        if(conn!=null){
            conn.close();
        }
        if(ppst!=null){
            ppst.close();
        }
        if(rs!=null){
            rs.close();
        }
    }
}
