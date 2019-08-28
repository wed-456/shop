package com.group.miShop.domain.vo;

import com.group.miShop.domain.entity.ShopCar;
import lombok.Data;

import java.util.List;

/**
 * 前端展示用
 */
@Data
public class UserVo {
    private String uid;
    private String userName;
    private List<ShopCar> shopCarList;
}
