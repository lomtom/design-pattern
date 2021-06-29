package com.lomtom.demo_0_3.service.impl;


import com.lomtom.demo_0_3.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:58
 **/
public class MallCardAwardService implements AwardService {
    private String award = "1000元 购物卡";
    @Override
    public void getAward(String username){
        System.out.println(username + "获得了" + award);
    }
}
