package com.group.miShop.domain.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private Integer uid;

    private Date lastLogin;

    private String userName;

    private String password;

    private String icon;

    private Date createDate;

    private Integer status;
}