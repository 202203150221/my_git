package com.wyh.controller;

import com.wyh.dto.SalesRecordWithProductDTO;
import com.wyh.po.SalesRecord;
import com.wyh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class SaleController {
    @Autowired
    public SaleService salesService;
    //获取全部销售信息
    @GetMapping("/sale")
    public Result getAll(){
        List<SalesRecord> sale=salesService.getAll();
        String msg=sale!=null?"":"数据查询失败了！";
        Integer code=sale!=null?Code.OK:Code.ERR;
        return new Result(code,sale,msg);
    }
    //插入销售信息
    @PostMapping("/sale")
    public Result insertSaleRecord(@RequestBody SalesRecord salesRecord){
        boolean lag=salesService.save(salesRecord);
        Integer code= lag?Code.OK:Code.ERR;
        return new Result(code,lag);
    }

    //查询销售记录和商品
    @GetMapping("/saleAndProduct")
    public Result getSalesRecordsWithProduct(){
        List<SalesRecordWithProductDTO> list= salesService.getSalesRecordsWithProduct();
        Integer code=list!=null?Code.OK:Code.ERR;
        String msg=list!=null?"":"没查询到";
        return new Result(code,list,msg);
    }
}
