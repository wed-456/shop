package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.Navigation;
import com.group.miShop.domain.entity.SubMenu;
import com.group.miShop.mapper.NavigationMapper;
import com.group.miShop.mapper.SubMenuMapper;
import com.group.miShop.service.CategoryService;
import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("/categoryServiceImpl")
public class CategoryServiceImpl implements CategoryService {
    @Resource
    SubMenuMapper subMenuMapper;
    @Resource
    NavigationMapper navigationMapper;

    @Override
    public CateBean findCatgory() {
        CateBean cateBean = new CateBean();
        List<SubMenu> subMenuList = subMenuMapper.findAllSubMenu();
        List<Navigation> navigationList = navigationMapper.findAllNav();
        if(navigationList!=null && !navigationList.isEmpty()){
            cateBean.setNavigationList(navigationList);
        }
        if(subMenuList!=null && !subMenuList.isEmpty()){
            cateBean.setSubMenuList(subMenuList);
        }
        return cateBean;
    }
}
