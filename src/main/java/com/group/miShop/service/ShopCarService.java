package com.group.miShop.service;

import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.utils.CateBean;

public interface ShopCarService {

    CateBean findByUId(int uid);

    /**
     * 用户添加购物车商品，增加还是修改
     * @param uid
     * @param shopId
     * @return
     */
    int findByUidShopId(int uid,int shopId,int number);

    /**
     * 假删除
     * @param carId
     * @return
     */
    int FalseDel(int carId);

    /**
     * 购物车的商品修改（数量的增加和减少）
     * op为操作值，1增加，2删除
     */
    int updateByOp (int carId,int op);
}
