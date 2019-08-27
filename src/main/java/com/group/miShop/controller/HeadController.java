package com.group.miShop.controller;

import com.group.miShop.service.HeadService;
import com.group.miShop.utils.CateBean;
import com.group.miShop.utils.Resoult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/api")
@Slf4j
@RestController
public class HeadController {
    /**
     * 获取前端头部所需要的数据
     *
     * 导航  轮播  二级菜单
     *
     *
     */
    @Resource
    HeadService headService;

    @GetMapping("heads")
    public Resoult heads(){
        //导航接口
        try{
            CateBean cateBean = headService.findAllHead();
            return Resoult.success(cateBean);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return Resoult.error();
    }


}
