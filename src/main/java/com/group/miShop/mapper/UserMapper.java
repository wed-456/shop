package com.group.miShop.mapper;


import com.group.miShop.domain.entity.ShopCar;
import com.group.miShop.domain.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findByUserName(@Param("userName") String userName);

    int add(@Param("userName") String userName,@Param("password") String password);




}