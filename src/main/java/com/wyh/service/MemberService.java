package com.wyh.service;

import com.wyh.po.Member;
import com.wyh.po.ProductInfo;

import java.util.List;

public interface MemberService {

    /*
    查询全部会员信息

     */
    public List<Member> getAll();


    /*
        添加会员信息

         */
    public boolean save(Member member);
    /*
删除会员信息

 */
    public boolean delete(Long id);


    /*
修改会员信息

 */
    public boolean update(Member member);
}
