package com.group.miShop.domain.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@Data
public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopMsg;

    private BigDecimal originalPrice;

    private BigDecimal promotePrice;

    private Integer stock;

    private Integer cateId;

    private Date createDate;

    private Integer status;

    private String title;
}