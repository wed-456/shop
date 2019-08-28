package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.Banner;
import com.group.miShop.domain.entity.Navigation;
import com.group.miShop.domain.entity.SubMenu;
import com.group.miShop.mapper.BannerMapper;
import com.group.miShop.mapper.NavigationMapper;
import com.group.miShop.mapper.SubMenuMapper;
import com.group.miShop.service.HeadService;
import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("/headServiceImpl")
public class HeadServiceImpl implements HeadService {
    @Resource
    NavigationMapper navigationMapper;

    @Resource
    SubMenuMapper subMenuMapper;

    @Resource
    BannerMapper bannerMapper;


    @Override
    public CateBean findAllHead() {
        CateBean cateBean = new CateBean();
        //导航
        List<Navigation> navigationList = navigationMapper.findAllNav();
        //分类
        List<SubMenu> subMenuList = subMenuMapper.findAllSubMenu();
        //轮播
        List<Banner> bannerList = bannerMapper.findAllBanner();
        if(navigationList!=null && !navigationList.isEmpty()){
            cateBean.setNavigationList(navigationList);
        }
        if(subMenuList!=null && !subMenuList.isEmpty()){
            cateBean.setSubMenuList(subMenuList);
        }
        if(bannerList!=null && !bannerList.isEmpty()){
            cateBean.setBannerList(bannerList);
        }
        return cateBean;
    }

}
