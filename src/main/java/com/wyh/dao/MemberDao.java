package com.wyh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wyh.po.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao extends BaseMapper<Member> {
}
