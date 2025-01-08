package com.wyh.controller;

import com.wyh.po.Employee;
import com.wyh.po.Member;
import com.wyh.po.SalesRecord;
import com.wyh.service.MemberService;
import com.wyh.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class MemberController {
    @Autowired
    public MemberService memberService;
    //获取全部会员信息
    @GetMapping("/member")
    public Result getAll(){
        List<Member> members=memberService.getAll();
        Integer code=members!=null?Code.OK:Code.ERR;
        String msg=members!=null?"":"数据查询失败了！";
        return new Result(code,members,msg);
    }
    //插入会员信息
    @PostMapping("/member")
    public Result insertMember(@RequestBody Member member){
        boolean lag=memberService.save(member);
        Integer code= lag?Code.OK:Code.ERR;
        return new Result(code,lag);
    }

    //删除会员信息
    @DeleteMapping("/member/{id}")
    public Result deleteMember(@PathVariable Long id) {
        boolean lag = memberService.delete(id);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }

    //修改会员信息
    @PutMapping("/member")
    public Result updateMember(@RequestBody Member member) {
        boolean lag = memberService.update(member);
        Integer code = lag ? Code.OK : Code.ERR;
        return new Result(code, lag);
    }
}
