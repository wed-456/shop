package com.group.miShop.controller;

import com.group.miShop.domain.entity.User;
import com.group.miShop.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mvc.xml","classpath:spring-mybatis.xml","classpath:spring-context.xml"})
public class IoginControllerTest {
    @Resource
    UserService userService;

    @Test
    public void login() {
        User user = userService.findByName("王", "123456");
        log.debug(user.toString());
    }

    @Test
    public void resgit(){
        int rows = userService.register("罗涛", "123456");
        log.debug("rows");
    }
}