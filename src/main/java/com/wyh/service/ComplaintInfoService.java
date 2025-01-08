package com.wyh.service;

import com.wyh.po.ComplaintInfo;
import com.wyh.po.ProductInfo;

import java.util.List;

public interface ComplaintInfoService {

    /*
    查询全部投诉信息

     */
    public List<ComplaintInfo> getAll();
    /*
删除投诉信息

 */
    public boolean delete(Long id);

}
