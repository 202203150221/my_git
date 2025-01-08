package com.wyh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wyh.dao.AdminLoginDao;
import com.wyh.dao.EmployeeLoginDao;
import com.wyh.po.Admin;
import com.wyh.po.Employee;
import com.wyh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private EmployeeLoginDao employeeLoginDao;
    @Autowired
    private AdminLoginDao adminLoginDao;
    @Override
    public Admin adminLogin(Admin admin) {
        LambdaQueryWrapper<Admin> lqw=new LambdaQueryWrapper<Admin>();
        lqw.eq(Admin::getUsername,admin.getUsername()).eq(Admin::getPassword,admin.getPassword());
        Admin loginAdmin=adminLoginDao.selectOne(lqw);
        return loginAdmin;
    }

    @Override
    public Employee employeeLogin(Employee employee) {
        LambdaQueryWrapper<Employee> lqw=new LambdaQueryWrapper<Employee>();
        lqw.eq(Employee::getEmployeeUsername,employee.getEmployeeUsername()).eq(Employee::getEmployeePassword,employee.getEmployeePassword());
        Employee loginEmployee=employeeLoginDao.selectOne(lqw);
        return loginEmployee;
    }
}
