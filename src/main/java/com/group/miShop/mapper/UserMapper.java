package com.group.miShop.mapper;


import com.group.miShop.domain.entity.User;
import com.group.miShop.domain.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findByUserName(@Param("userName") String userName);

    int add(@Param("userName") String userName,@Param("password") String password);

    /**
     * 通过用户id查找购物车信息
     * @param uid
     * @return
     */
    UserVo findShopCarById(int uid);


}