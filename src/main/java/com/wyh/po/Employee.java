package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Employee")
public class Employee {
    @TableId(type = IdType.AUTO,value = "EmployeeID")
    public Long employeeID;
    @TableField("EmployeeName")
    public String employeeName;
    @TableField("EmployeePassword")
    public String employeePassword;
    @TableField("EmployeePosition")
    public String employeePosition;
    @TableField("EmployeeUsername")
    public String employeeUsername;
    @TableField("EmployeePhone")
    public String employeePhone;

}
