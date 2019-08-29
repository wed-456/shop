package com.group.miShop.service.impl;

import com.group.miShop.domain.vo.ShopVo;
import com.group.miShop.mapper.ShopMapper;
import com.group.miShop.service.SearchService;
import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("/serchServiceImpl")
public class SerchServiceImpl implements SearchService {
    @Resource
    ShopMapper shopMapper;

    @Override
    public CateBean findSearch(String keyword, int page) {
        CateBean cateBean = new CateBean();
        List<ShopVo> shopVoList = shopMapper.findShop(keyword, page);
        cateBean.setShopVoList(shopVoList);

        return cateBean;
    }

    @Override
    public CateBean findSearchByName(String ShopName) {
        CateBean cateBean = new CateBean();
        List<ShopVo> shopVoList = shopMapper.findShopByShopName(ShopName);
        cateBean.setShopVoList(shopVoList);
        return cateBean;
    }


}
