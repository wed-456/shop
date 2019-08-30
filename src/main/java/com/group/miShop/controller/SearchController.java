package com.group.miShop.controller;

import com.group.miShop.service.SearchService;
import com.group.miShop.utils.CateBean;
import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@Slf4j
@RequestMapping("/api")
public class SearchController {
    @Resource
    SearchService searchService;
    /**
     * 商品的模糊查询
     */
    @GetMapping("/find")
    public Resoult find(String keyWord,String page){
        try {
            int new_page = Integer.parseInt(page);
            CateBean cateBean = searchService.findSearch(keyWord, new_page);
            if(cateBean!=null){
                return Resoult.success(cateBean);
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
      return Resoult.error();
    }

    /**
     * 商品的名字查询
     */
    @GetMapping("/findByShopName")
    public Resoult findByShopName(String shopName){
        try {
            CateBean cateBean = searchService.findSearchByName(shopName);
            return Resoult.success(cateBean);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }
}
