package com.wyh.controller;

import com.wyh.po.Employee;
import com.wyh.po.ReturnInfo;
import com.wyh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    //查询全部员工信息
    @GetMapping("/employee")
    public Result getAll() {
        List<Employee> employees = employeeService.getAll();
        Integer code = employees != null ? Code.OK : Code.ERR;
        String msg = employees != null ? "" : "查询失败";
        return new Result(code, employees, msg);
    }

    //新增员工信息
    @PostMapping("/employee")
    public Result insertEmployee(@RequestBody Employee employee) {
        boolean lag = employeeService.save(employee);
        Integer code = lag ? Code.OK : Code.ERR;
        String msg = lag ? "" : "插入数据错误";
        return new Result(code, lag, msg);
    }

    //删除员工信息
    @DeleteMapping("/employee/{id}")
    public Result deleteEmployee(@PathVariable Long id) {
        boolean lag = employeeService.delete(id);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }

    //修改员工信息
    @PutMapping("/employee")
    public Result updateEmployee(@RequestBody Employee employee) {
        boolean lag = employeeService.update(employee);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }
}
