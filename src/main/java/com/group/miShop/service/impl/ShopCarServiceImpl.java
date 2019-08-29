package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.mapper.ShopCarMapper;
import com.group.miShop.service.ShopCarService;
import com.group.miShop.utils.CateShopBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service("shopCarServiceImpl")
public class ShopCarServiceImpl implements ShopCarService {

    @Resource
    ShopCarMapper shopCarMapper;


    @Override
    public CateShopBean findByUId(int uid) {
        //如果没有登录，不可以使用，购物车没有商品，则查询不了东西
        //获取用户所有的购物车信息
        //拿到商品id 查询出来
        CateShopBean cateShopBean = new CateShopBean();
        List<ShopCar> shopCarById = shopCarMapper.findShopCarById(uid);
        if(shopCarById!=null && !shopCarById.isEmpty()){
            cateShopBean.setShopCarList(shopCarById);
            return cateShopBean;
        }

       return null;
    }

    /**
     * 查询购物车记录
     * @param uid
     * @param shopId
     * @return
     */
    @Override
    public int findByUidShopId(int uid, int shopId,int number) {
        ShopCar shopCar = shopCarMapper.findByUidShopId(uid, shopId);
        if(shopCar!=null){
            //不为空，则购物车有数据记录
            //更新
            int rows = shopCarMapper.updateNumber(uid, shopId, number);
            return rows;
        }else {
            //添加
            int rows = shopCarMapper.insertShopCar(uid, shopId, number);
            return rows;
        }
    }

    /**
     * 假删除
     * @param carId
     * @return
     */
    @Override
    public int falseDel(Integer carId) {
        int row = shopCarMapper.falseDel(carId);
        if(row>0){
            return row;
        }
        return 0;
    }

    /**
     * 购物车记录的增加和删除
     * @param carId
     * @param op
     * @return
     */
    @Override
    public int updateByOp(int carId, int op) {
        int rows = shopCarMapper.updateByOp(carId, op);
        return rows;
    }

}
