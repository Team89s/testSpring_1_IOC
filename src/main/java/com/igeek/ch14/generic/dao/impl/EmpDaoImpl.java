package com.igeek.ch14.generic.dao.impl;

import com.igeek.ch14.generic.dao.IDao;
import com.igeek.ch14.generic.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmpDaoImpl implements IDao<Employee> {

    @Autowired(required = false)
    private Employee employee;

    @Override
    public void insert() {
        System.out.println("EmpDaoImpl insert...");
        System.out.println(employee);
    }
}
