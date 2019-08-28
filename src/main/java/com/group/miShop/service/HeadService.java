package com.group.miShop.service;

import com.group.miShop.domain.entity.Navigation;
import com.group.miShop.utils.CateBean;

import java.util.List;

public interface HeadService {
    /**
     * 获取首页头部所有信息
     * @return
     */
    CateBean findAllHead();

}
