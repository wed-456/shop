package com.group.miShop.service;

import com.group.miShop.domain.entity.User;

public interface UserService {
    /**
     * 查询名字，登录
     * @param username
     * @return
     */
    User findByName (String username,String password);

    /**
     * 注册
     */
    int register (String username,String password);


}
