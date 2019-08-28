package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.domain.vo.UserVo;
import com.group.miShop.mapper.ShopCarMapper;
import com.group.miShop.mapper.UserMapper;
import com.group.miShop.service.ShopCarService;
import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Service("shopCarServiceImpl")
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    UserMapper userMapper;
    @Resource
    ShopCarMapper shopCarMapper;
    @Resource


    @Override
    public CateBean findByUId(int uid) {
        CateBean cateBean = new CateBean();
        UserVo userVo = userMapper.findShopCarById(uid);
        //如果没有登录，不可以使用，购物车没有商品，则不查询
        //获取用户所有的购物车信息
        //拿到商品id 查询出来
        if(userVo!=null){
            //装商品id
            ArrayList<Integer> arrayList = new ArrayList();
            List<ShopCar> shopCarList = userVo.getShopCarList();
            for(int i=0;i<shopCarList.size();i++){
                //有可能是多个
               Integer shopId  = shopCarList.get(i).getShopId();
               arrayList.add(shopId);
            }
            if(arrayList.size()>0){
                for (int i = 0; i < arrayList.size(); i++) {
                    Integer NewShopId = arrayList.get(i);

                }
            }
            cateBean.setUserVo(userVo);
        }
        return cateBean;
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
    public int FalseDel(int carId) {
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
