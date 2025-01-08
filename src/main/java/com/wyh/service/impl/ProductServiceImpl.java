package com.wyh.service.impl;

import com.wyh.dao.ProductDao;
import com.wyh.po.ProductInfo;
import com.wyh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Override
    public List<ProductInfo> getAll() {
        return productDao.selectList(null);
    }

    @Override
    public boolean save(ProductInfo product) {
        return productDao.insert(product)>0;
    }

    @Override
    public boolean delete(Long id) {
        return productDao.deleteById(id)>0;
    }

    @Override
    public boolean update(ProductInfo productInfo) {
        return productDao.updateById(productInfo)>0;
    }
}
