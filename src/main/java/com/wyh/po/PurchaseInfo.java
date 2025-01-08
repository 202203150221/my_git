package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("PurchaseInfo")
public class PurchaseInfo {
    @TableId(type = IdType.AUTO,value = "PurchaseID")
    public Long purchaseID;
    @TableField("ProductID")
    public Long productID;
    @TableField(exist = false)
    public String productName;
    @TableField("Quantity")
    public Integer quantity;
    @TableField("UnitCost")
    public double unitCost;
    @TableField("PurchaseDate")
    public String purchaseDate;
}
