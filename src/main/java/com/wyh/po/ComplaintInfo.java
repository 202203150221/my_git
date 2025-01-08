package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ComplaintInfo")
public class ComplaintInfo {
    @TableId(type = IdType.AUTO,value = "ComplaintID")
    public Long complaintID;
    @TableField("ComplaintContent")
    public String complaintContent;
    @TableField("ComplaintDate")
    public String complaintDate;
    @TableField("Status")
    //状态：已处理/未处理
    public String status;
    @TableField("MemberID")
    public Long memberID;
}
