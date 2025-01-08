package com.wyh.controller;

import com.wyh.po.Employee;
import com.wyh.po.ProductInfo;
import com.wyh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {
    @Autowired
    public ProductService productService;

    //查询全部商品信息
    @GetMapping("/product")
    public Result getAll(){
        List< ProductInfo > productInfos=productService.getAll();
        Integer code=productInfos!=null?Code.OK:Code.ERR;
        String msg=productInfos!=null?"":"查询错误";
        return  new Result(code,productInfos,msg);
    }

    //新增商品信息
    @PostMapping("/product")
    public Result insertProduct(@RequestBody ProductInfo product){
        boolean lag=productService.save(product);
        Integer code=lag?Code.OK:Code.ERR;
        String msg =lag?"":"发生错误，无法插入数据!";
        return new Result(code,lag,msg);
    }

    //删除商品信息
    @DeleteMapping("/product/{id}")
    public Result deleteProduct(@PathVariable Long id) {
        boolean lag = productService.delete(id);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }

    //修改商品信息
    @PutMapping("/product")
    public Result updateProduct(@RequestBody ProductInfo productInfo) {
        boolean lag = productService.update(productInfo);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }
}
