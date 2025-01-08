package com.wyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyh.po.PurchaseInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseInfo> {
}
