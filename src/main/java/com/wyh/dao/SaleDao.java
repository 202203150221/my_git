package com.wyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyh.dto.SalesRecordWithProductDTO;
import com.wyh.po.SalesRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SaleDao extends BaseMapper<SalesRecord> {

    @Select("SELECT sr.SaleID, sr.ProductID, pi.ProductName, pi.Brand, sr.Quantity, sr.UnitPrice, sr.SaleDate, sr.MemberID " +
            "FROM SalesRecord sr " +
            "JOIN ProductInfo pi ON sr.ProductID = pi.ProductID")
    List<SalesRecordWithProductDTO> selectSalesRecordsWithProduct();
}
