package com.wyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyh.po.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeDao extends BaseMapper<Employee> {
}
