package com.wyh.service.impl;

import com.wyh.dao.PurchaseDao;
import com.wyh.po.PurchaseInfo;
import com.wyh.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseDao purchaseDao;
    @Override
    public List<PurchaseInfo> getAll() {
        return purchaseDao.selectList(null);
    }

    @Override
    public boolean save(PurchaseInfo purchaseInfo) {
        return purchaseDao.insert(purchaseInfo)>0;
    }

    @Override
    public boolean delete(Long id) {
        return purchaseDao.deleteById(id)>0;
    }

    @Override
    public boolean update(PurchaseInfo purchaseInfo) {
        return purchaseDao.updateById(purchaseInfo)>0;
    }
}
