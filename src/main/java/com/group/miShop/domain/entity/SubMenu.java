package com.group.miShop.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class SubMenu {
    private Integer subMenuId;

    private String subName;

    private Integer status;

    private List<SubMenu1> subMenu1List;
}