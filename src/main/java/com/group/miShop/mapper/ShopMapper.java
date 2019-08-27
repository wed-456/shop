package com.group.miShop.mapper;

import com.group.miShop.domain.entity.Shop;
import com.group.miShop.domain.vo.ShopVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopMapper {
    /**
     * 模糊查询
     * @param keyWord 关键字
     * @param page 前端传页数
     * @return
     */
    List<ShopVo> findShop(@Param("keyword") String keyWord, @Param("page") int page);

}