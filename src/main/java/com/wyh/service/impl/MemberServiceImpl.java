package com.wyh.service.impl;

import com.wyh.dao.MemberDao;
import com.wyh.po.Member;
import com.wyh.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;
    @Override
    public List<Member> getAll() {
        return memberDao.selectList(null);
    }

    @Override
    public boolean save(Member member) {
        return memberDao.insert(member)>0;
    }

    @Override
    public boolean delete(Long id) {
        return memberDao.deleteById(id)>0;
    }

    @Override
    public boolean update(Member member) {
        return memberDao.updateById(member)>0;
    }
}
