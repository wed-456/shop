package com.group.miShop.service;

import com.group.miShop.utils.CateBean;

import java.util.List;

public interface SearchService {
    CateBean findSearch(String keyword,int page);
}
