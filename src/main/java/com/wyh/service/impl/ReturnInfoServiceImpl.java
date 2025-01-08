package com.wyh.service.impl;

import com.wyh.dao.ReturnInfoDao;
import com.wyh.po.ReturnInfo;
import com.wyh.service.ReturnInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnInfoServiceImpl implements ReturnInfoService {
    @Autowired
    private ReturnInfoDao returnInfoDao;
    @Override
    public List<ReturnInfo> getAll() {
        return returnInfoDao.selectList(null);
    }

    @Override
    public boolean save(ReturnInfo returnInfo) {
        return returnInfoDao.insert(returnInfo)>0;
    }

    @Override
    public boolean delete(Long returnID) {
        return returnInfoDao.deleteById(returnID)>0;
    }

    @Override
    public boolean update(ReturnInfo returnInfo) {
        return returnInfoDao.updateById(returnInfo)>0;
    }
}
