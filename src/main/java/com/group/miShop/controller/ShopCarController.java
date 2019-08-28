package com.group.miShop.controller;

import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.service.ShopCarService;
import com.group.miShop.utils.CateBean;
import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/api")
public class ShopCarController {

    @Resource
    ShopCarService shopCarService;

    /**
     * 通过用户查询购物车记录,如果有返回具体商品信息，商品id 图片 价格
     */
    @GetMapping("/shopCar")
    public Resoult findByUId(int uid){
        try{
            CateBean cateBean = shopCarService.findByUId(uid);

            return Resoult.success(cateBean);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }

    /**
     * 判断商品是否存在购物车中
     * 是添加  还是修改数量
     */

    @GetMapping( "/selsctShopCar")
    public Resoult findByUidShopId(int uid ,int shopId,int number){
        try {
            int row = shopCarService.findByUidShopId(uid, shopId, number);
            //应该加一个包装类，让前端知道是修改成功，还是添加成功
            if(row>0){
                return Resoult.success(row);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }

    /**
     * 假删除购物车记录
     */
    @GetMapping("/falseDel")
    public Resoult Falsedel(int carId){
        try{
            int row = shopCarService.FalseDel(carId);
            if(row>0){
                return Resoult.success(row);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }

    /**
     * 购物车的商品记录增加和删除,根据操作值
     */
    @GetMapping("/updateByOp")
    public Resoult updateByOp(int carId,int op){
        try{
            int rows = shopCarService.updateByOp(carId, op);
            if(rows>0){
                return Resoult.success(rows);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }
}
