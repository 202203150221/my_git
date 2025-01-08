package com.wyh.controller;

import com.wyh.po.Employee;
import com.wyh.po.PurchaseInfo;
import com.wyh.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class PurchaseController {
    @Autowired
    public PurchaseService purchaseService;

    @GetMapping("/purchase")
    //查询全部进货信息
    public Result getAll(){
        List<PurchaseInfo> purchaseInfos=purchaseService.getAll();
        Integer code=purchaseInfos!=null?Code.OK:Code.ERR;
        String msg=purchaseInfos!=null?"":"查询进货信息错误";
        return new Result(code,purchaseInfos,msg);
    }

    //新增进货信息
    @PostMapping("/purchase")
    public Result insertPurchase(@RequestBody PurchaseInfo purchaseInfo){
        boolean lag=purchaseService.save(purchaseInfo);
        Integer code=lag?Code.OK:Code.ERR;
        String msg =lag?"":"添加失败";
        return  new Result(code,lag,msg);

        }
    //删除进货信息
    @DeleteMapping("/purchase/{id}")
    public Result deletePurchase(@PathVariable Long id) {
        boolean lag = purchaseService.delete(id);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }

    //修改进货信息
    @PutMapping("/purchase")
    public Result updatePurchase(@RequestBody PurchaseInfo purchaseInfo) {
        boolean lag = purchaseService.update(purchaseInfo);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }

}
