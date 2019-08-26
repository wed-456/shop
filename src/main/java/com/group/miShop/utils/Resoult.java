package com.group.miShop.utils;

import lombok.Data;

import static com.group.miShop.utils.Constants.*;

@Data
public class Resoult<T> {
    private String msg ;
    private int status;
    private T data;

    public static Resoult success(Object object){
        Resoult<Object> resoult = new Resoult<>();
        resoult.setMsg(SUCCESS_MSG);
        resoult.setStatus(SUCCESS_STATUS);
        resoult.setData(object);
        return resoult;
    }

    public static Resoult error(){
        Resoult<Object> resoult = new Resoult<>();
        resoult.setMsg(ERROR_MSG);
        resoult.setStatus(ERROR_STATUS);
        return resoult;
    }
}
