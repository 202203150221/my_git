package com.wyh.service;

import com.wyh.dao.EmployeeDao;
import com.wyh.po.Employee;
import com.wyh.po.ProductInfo;

import java.util.List;

public interface EmployeeService {
    /*
    查询全部员工信息

     */
    public List<Employee> getAll();

    /*
    新增员工信息

     */

    public boolean save(Employee employee);

    /*
删除员工信息

 */
    public boolean delete(Long id);


    /*
修改员工信息

 */
    public boolean update(Employee employee);
}
