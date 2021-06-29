package com.lomtom.demo_0_0.service;


/**
 * @author lomtom
 * @date 2021/6/24 16:55
 **/
public class AwardService {
    private String award = "1000元 购物卡";
    public void getAward(String username){
        System.out.println(username + "获得了" + award);
    }
}
