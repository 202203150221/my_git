package com.wyh.controller;

import com.wyh.po.Admin;
import com.wyh.po.Employee;
import com.wyh.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class loginController {
    @Autowired
    public LoginService loginService;

    //管理员登录
    @PostMapping("/adminLogin")
    public Result adminLogin(@RequestBody Admin admin){
        Admin admin1=loginService.adminLogin(admin);
        Integer code=admin1!=null?Code.OK:Code.ERR;
        String msg=admin1!=null?"登录成功!":"账号密码错误，请仔细验证后重新输入！";
        return new Result(code,null,msg);
    }
    //员工登录
    @PostMapping("/employeeLogin")
    public Result employeeLogin(@RequestBody Employee employee){
        Employee employee1=loginService.employeeLogin(employee);
        Integer code=employee1!=null?Code.OK:Code.ERR;
        String msg=employee1!=null?"登录成功!":"账号密码错误，请仔细验证后重新输入！";
        return new Result(code,null,msg);
    }
}
