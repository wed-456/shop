package com.group.miShop.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class Navigation {
    private Integer navId;

    private String navName;

    private Integer navStatus;

    private List<NavMenu> navMenuList;
}