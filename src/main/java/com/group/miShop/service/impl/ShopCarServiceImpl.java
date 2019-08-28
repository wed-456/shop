package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.domain.entity.User;
import com.group.miShop.domain.vo.UserVo;
import com.group.miShop.mapper.ShopCarMapper;
import com.group.miShop.mapper.UserMapper;
import com.group.miShop.service.ShopCarService;
import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("shopCarServiceImpl")
public class ShopCarServiceImpl implements ShopCarService {
    @Resource
    UserMapper userMapper;

    @Override
    public CateBean findByUId(int uid) {
        CateBean cateBean = new CateBean();
        UserVo userVo = userMapper.findShopCarById(uid);
        cateBean.setUserVo(userVo);
        return cateBean;
    }
}
