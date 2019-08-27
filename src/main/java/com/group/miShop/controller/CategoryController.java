package com.group.miShop.controller;

import com.group.miShop.domain.entity.Navigation;
import com.group.miShop.domain.entity.SubMenu;
import com.group.miShop.mapper.NavigationMapper;
import com.group.miShop.mapper.ShopMapper;
import com.group.miShop.mapper.SubMenuMapper;
import com.group.miShop.service.CategoryService;
import com.group.miShop.utils.CateBean;
import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品分类展示 详情
 */
@Slf4j
@RequestMapping("api")
@RestController
public class CategoryController {
    /**
     * 获取一级商品数据和二级商品数据
     */
    @Resource
    CategoryService categoryService;

    @GetMapping("/showCategory")
    public Resoult showCategory(){
        try{
            CateBean catgory = categoryService.findCatgory();
            return Resoult.success(catgory);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }
}
