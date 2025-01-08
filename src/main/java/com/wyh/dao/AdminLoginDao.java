package com.wyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyh.po.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminLoginDao extends BaseMapper<Admin> {
}
