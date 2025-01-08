package com.wyh.service;

import com.wyh.po.ReturnInfo;

import java.util.List;

public interface ReturnInfoService {
    /*
   查询全部退货信息

    */
    public List<ReturnInfo> getAll();
    /*
        添加退货信息

         */
    public boolean save(ReturnInfo returnInfo);

    /*
   删除退货信息

    */
    public boolean delete(Long returnID);


       /*
   修改退货信息

    */
    public boolean update(ReturnInfo returnInfo);
}
