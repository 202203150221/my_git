package com.wyh.controller;

import com.wyh.po.ComplaintInfo;
import com.wyh.po.SalesRecord;
import com.wyh.service.ComplaintInfoService;
import com.wyh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class ComplaintInfoController {
    @Autowired
    public ComplaintInfoService complaintInfoService;
    //获取全部投诉信息
    @GetMapping("/complaint")
    public Result getAll(){
        List<ComplaintInfo> complaintInfos=complaintInfoService.getAll();
        Integer code=complaintInfos!=null?Code.OK:Code.ERR;
        String msg=complaintInfos!=null?"":"数据查询失败了！";
        return new Result(code,complaintInfos,msg);
    }

    //删除投诉信息
    @DeleteMapping("/complaint/{id}")
    public Result deleteComplaint(@PathVariable Long id){
        boolean lag=complaintInfoService.delete(id);
        Integer code= lag?Code.OK:Code.ERR;
        return  new Result(code,lag);
    }
}
