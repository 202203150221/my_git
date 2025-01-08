package com.wyh.controller;

import com.wyh.po.ReturnInfo;
import com.wyh.po.SalesRecord;
import com.wyh.service.ReturnInfoService;
import com.wyh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("")
public class ReturnInfoController {
    @Autowired
    public ReturnInfoService returnInfoService;
    //获取全部退货信息
    @GetMapping("/return")
    public Result getAll(){
        List<ReturnInfo> returnInfos=returnInfoService.getAll();
        Integer code=returnInfos!=null?Code.OK:Code.ERR;
        String msg=returnInfos!=null?"":"数据查询失败了！";
        return new Result(code,returnInfos,msg);
    }
    //插入退货信息
    @PostMapping("/return")
    public Result insertReturnInfo(@RequestBody ReturnInfo returnInfo){
        boolean lag=returnInfoService.save(returnInfo);
        Integer code= lag?Code.OK:Code.ERR;
        return new Result(code,lag);
    }

    //删除退货信息
    @DeleteMapping("/return/{returnID}")
    public Result deleteReturnInfo(@PathVariable Long returnID){
        boolean lag=returnInfoService.delete(returnID);
        Integer code= lag?Code.OK:Code.ERR;
        return new Result(code,lag);
    }

    //修改退货信息
    @PutMapping("/return")
    public Result updateReturnInfo(@RequestBody ReturnInfo returnInfo){
        boolean lag=returnInfoService.update(returnInfo);
        Integer code= lag?Code.OK:Code.ERR;
        return new Result(code,lag);

    }
}
