package com.group.miShop.service;

import com.group.miShop.utils.CateBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("/categoryService")
public interface CategoryService {
    /**
     * 详情页查询
     * @return
     */
    CateBean findCatgory();

}
