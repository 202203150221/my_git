package com.wyh.service.impl;

import com.wyh.dao.ComplaintInfoDao;
import com.wyh.po.ComplaintInfo;
import com.wyh.service.ComplaintInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintInfoImpl implements ComplaintInfoService {
    @Autowired
    private ComplaintInfoDao complaintInfoDao;

    @Override
    public List<ComplaintInfo> getAll() {
        return complaintInfoDao.selectList(null);
    }

    @Override
    public boolean delete(Long id) {
        return complaintInfoDao.deleteById(id)>0;
    }
}
