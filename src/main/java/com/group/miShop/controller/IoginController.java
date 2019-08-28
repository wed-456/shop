package com.group.miShop.controller;

import com.group.miShop.domain.entity.User;
import com.group.miShop.service.UserService;
import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RequestMapping("/api")
@RestController
public class IoginController {
    @Resource
    UserService userService;

    /**
     * 登录
     */

    @PostMapping("/login")
    public Resoult login(String username,String password){
        User user = userService.findByName(username,password);
            if(user!=null ){
                Resoult.success(user);
            }
        return Resoult.error();
    }

    /**
     * 注册
     */

    @RequestMapping("/register")
    public Resoult register(String username,String password){
        int rows = userService.register(username, password);
        if(rows!=0){
            Resoult.success(rows);
        }
        return Resoult.error();
    }
}
