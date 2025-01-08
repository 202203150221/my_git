package com.wyh.dto;

import lombok.Data;

@Data
public class SalesRecordWithProductDTO {
    private Long saleID; // 销售记录ID
    private Long productID; // 商品ID
    private String productName; // 商品名称
    private String brand; // 品牌
    private Integer quantity; // 销售数量
    private Double unitPrice; // 销售单价
    private String saleDate; // 销售日期
    private Long memberID; // 会员ID（可空）

}
