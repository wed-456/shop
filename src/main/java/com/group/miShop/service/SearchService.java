package com.group.miShop.service;

import com.group.miShop.utils.CateBean;

import java.util.List;

public interface SearchService {
    /**
     * 商品模糊查询
     * @param keyword
     * @param page
     * @return
     */
    CateBean findSearch(String keyword,int page);

    /**
     * 名字查询
     */
    CateBean findSearchByName(String ShopName);
}
