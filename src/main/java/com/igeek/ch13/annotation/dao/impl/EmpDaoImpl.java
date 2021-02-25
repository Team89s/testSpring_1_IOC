package com.igeek.ch13.annotation.dao.impl;

import com.igeek.ch13.annotation.dao.IDao;
import com.igeek.ch13.annotation.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements IDao {

    @Autowired(required = false)
    private Employee employee;

    @Override
    public void insert() {
        System.out.println("EmpDaoImpl insert...");
        System.out.println(employee);
    }
}
