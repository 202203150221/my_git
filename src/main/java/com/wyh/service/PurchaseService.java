package com.wyh.service;

import com.wyh.po.PurchaseInfo;
import com.wyh.po.ReturnInfo;

import java.util.List;

public interface PurchaseService {
    /*
    查询全部进货信息

     */
    public List<PurchaseInfo> getAll();

    /*
    新增进货信息

     */
    public boolean save(PurchaseInfo purchaseInfo);

    /*
  删除进货信息

   */
    public boolean delete(Long id);


    /*
修改进货信息

 */
    public boolean update(PurchaseInfo purchaseInfo);

}
