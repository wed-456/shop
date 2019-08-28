package com.group.miShop.utils;

import com.group.miShop.domain.entity.Banner;
import com.group.miShop.domain.entity.Navigation;

import com.group.miShop.domain.entity.SubMenu;
import com.group.miShop.domain.vo.ShopVo;
import com.group.miShop.domain.vo.UserVo;
import lombok.Data;

import java.util.List;
@Data
public class CateBean {
    /**
     * 轮播图类
     * 品种类
     * 导航类 所有菜单信息 三表查询的结果都在这里
     */
    List<Navigation> navigationList;
    List<SubMenu> subMenuList;
    List<Banner> bannerList;

    /**
     * 商品包装
     */
    List<ShopVo> shopVoList;

    /**
     * 购物车包装
     */
    UserVo userVo;
}
