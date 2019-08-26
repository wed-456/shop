package com.group.miShop.service.impl;

import com.group.miShop.domain.entity.User;
import com.group.miShop.mapper.UserMapper;
import com.group.miShop.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("/userServiceImol")
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;


    @Override
    public User findByName(String username, String password) {
        User user = userMapper.findByUserName(username);

        if(user!=null &&  user.getPassword().equals(password)){

            return user;
        }
        return null;
    }

    @Override
    public int register(String username, String password) {
        int rows = userMapper.add(username, password);
        if(rows!=0){
            return rows;
        }
        return 0;
    }
}
