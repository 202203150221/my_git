package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("SalesRecord")
public class SalesRecord {
    @TableId(type = IdType.AUTO ,value = "SaleID")
    public Long saleID;
    @TableField("ProductID")
    public Long productID;
    @TableField("Quantity")
    public Integer quantity;
    @TableField("UnitPrice")
    public double unitPrice;
    @TableField("SaleDate")
    public String saleDate;
    @TableField("MemberID")
    public Long memberID ;
}
