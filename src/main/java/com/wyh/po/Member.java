package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Member")
public class Member {
    @TableId(type = IdType.AUTO,value = "MemberID")
    public Long memberID;
    @TableField("MemberName")
    public String memberName;
    @TableField("PhoneNumber")
    public String phoneNumber;
    @TableField("JoinDate")
    public String joinDate;
    @TableField("Points")
    public Integer points;
    @TableField("Level")
    public String level;
}
