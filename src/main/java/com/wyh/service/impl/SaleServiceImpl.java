package com.wyh.service.impl;

import com.wyh.dao.SaleDao;
import com.wyh.dto.SalesRecordWithProductDTO;
import com.wyh.po.SalesRecord;
import com.wyh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDao salesDao;

    @Override
    public List<SalesRecord> getAll() {
        return salesDao.selectList(null);
    }

    @Override
    public boolean save(SalesRecord sale) {
        return salesDao.insert(sale)>0;
    }

    @Override
    public List<SalesRecordWithProductDTO> getSalesRecordsWithProduct() {
        return salesDao.selectSalesRecordsWithProduct();
    }

}
