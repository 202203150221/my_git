package com.wyh.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ReturnInfo")
public class ReturnInfo {
    @TableId(type = IdType.AUTO,value = "ReturnID")
    public Long returnID;
    @TableField("SaleID")
    public Long saleID;
    @TableField("ProductID")
    public Long productID;
    @TableField(exist = false)
    public String productName;
    @TableField("Quantity")
    public Integer quantity;
    @TableField("Reason")
    public String reason;
    @TableField("ReturnDate")
    public String returnDate;

}
