package com.group.miShop.domain.entity;

import com.group.miShop.domain.vo.ShopVo;
import lombok.Data;

import java.util.List;

@Data
public class ShopCar {
    private Integer carId;

    private Integer shopId;

    private Integer number;

    private Integer uid;

    private Integer oid;

    private Integer status;

    private List<ShopVo> shopVoList;
}