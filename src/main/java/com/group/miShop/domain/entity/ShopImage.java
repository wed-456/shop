package com.group.miShop.domain.entity;

import lombok.Data;

@Data
public class ShopImage {
    private Integer shopImgId;

    private Integer shopId;

    private String shopImg;

    private Integer status;
}