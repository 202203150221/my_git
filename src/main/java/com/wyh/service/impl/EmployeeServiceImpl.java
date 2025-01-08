package com.wyh.service.impl;

import com.wyh.dao.EmployeeDao;
import com.wyh.po.Employee;
import com.wyh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<Employee> getAll() {
        return employeeDao.selectList(null);
    }

    @Override
    public boolean save(Employee employee) {
        return employeeDao.insert(employee)>0;
    }

    @Override
    public boolean delete(Long id) {
        return employeeDao.deleteById(id)>0;
    }

    @Override
    public boolean update(Employee employee) {
        return employeeDao.updateById(employee)>0;
    }
}
