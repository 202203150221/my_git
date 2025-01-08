package com.wyh.service;

import com.wyh.po.ProductInfo;
import com.wyh.po.ReturnInfo;

import java.util.List;

public interface ProductService {

    /*
    查询全部商品信息

     */
    public List<ProductInfo> getAll();

    /*
    新增商品信息

     */
    public boolean save(ProductInfo product);

    /*
  删除商品信息

   */
    public boolean delete(Long id);


    /*
修改商品信息

 */
    public boolean update(ProductInfo productInfo);
}

