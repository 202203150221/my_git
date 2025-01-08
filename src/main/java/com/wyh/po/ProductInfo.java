package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ProductInfo")
public class ProductInfo {
    @TableId(type = IdType.AUTO,value = "ProductID")
    public Long productID;
    @TableField("ProductName")
    public String productName;
    @TableField("Brand")
    public String brand;
    @TableField("UnitPrice")
    public double unitPrice;
    @TableField("StockQuantity")
    public Integer stockQuantity;
    @TableField("Description")
    public String description;


}
