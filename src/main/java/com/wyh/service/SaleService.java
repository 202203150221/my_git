package com.wyh.service;

import com.wyh.dto.SalesRecordWithProductDTO;
import com.wyh.po.SalesRecord;

import java.util.List;

public interface SaleService {
    /*
    查询全部销售信息

     */
    public List<SalesRecord> getAll();
    /*
        添加销售信息

         */
    public boolean save(SalesRecord sale);
 /*
        查询销售信息与对应商品信息

         */

    List<SalesRecordWithProductDTO> getSalesRecordsWithProduct();
}
