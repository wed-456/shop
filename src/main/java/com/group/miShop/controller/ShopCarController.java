package com.group.miShop.controller;

import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class ShopCarController {
    /**
     * 通过用户查询购物车记录
     */
    public Resoult findByUId(int uid){
        return null;
    }

}
