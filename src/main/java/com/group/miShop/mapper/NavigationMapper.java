package com.group.miShop.mapper;

import com.group.miShop.domain.entity.Navigation;

import java.util.List;

public interface NavigationMapper {
    /**
     * 查找所有的导航信息
     * @return
     */
    List<Navigation> findAllNav();
}