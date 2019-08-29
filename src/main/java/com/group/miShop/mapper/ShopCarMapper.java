package com.group.miShop.mapper;

import com.group.miShop.domain.entity.ShopCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopCarMapper {

    /**
     * 根据用户id 商品id 查询购物车信息
     */
    ShopCar findByUidShopId(@Param("uid") int uid, @Param("shopId") int shopId);

    /**
     * 修改购物车记录中，单条商品记录
     */
    int updateNumber (@Param("uid") int uid, @Param("shopId") int shopId,@Param("number") int number);

    /**
     * 添加新的购物车记录
     */
    int insertShopCar(@Param("uid") int uid, @Param("shopId") int shopId,@Param("number") int number);

    /**
     * 假删除购物车记录
     */
    int falseDel(@Param("carId") Integer carId);

    /**
     * 通过操作值修改单个购物车记录的商品数量
     */
    int updateByOp(@Param("carId")int carId,@Param("op") int op);

    /**
     * 通过用户id查找购物车信息
     * @param uid
     * @return
     */
    List<ShopCar> findShopCarById(int uid);
}