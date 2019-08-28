package com.group.miShop.domain.vo;

import com.group.miShop.domain.entity.Shop;
import com.group.miShop.domain.entity.ShopImage;
import lombok.Data;

import java.util.List;

@Data
public class ShopVo extends Shop {

    private List<ShopImage> shopImageList;

}
