package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("Admin")
public class Admin {
    @TableId(type = IdType.AUTO,value = "AdminID")
    public Long adminID;
    @TableField("Username")
    public String username;
    @TableField("Password")
    public String password;

}
