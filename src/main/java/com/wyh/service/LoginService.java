package com.wyh.service;

import com.wyh.po.Admin;
import com.wyh.po.Employee;

public interface LoginService {
    /*
      管理员登录
     */
    public Admin adminLogin(Admin admin);

    /*
      员工登录
     */
    public Employee employeeLogin(Employee employee);

}
