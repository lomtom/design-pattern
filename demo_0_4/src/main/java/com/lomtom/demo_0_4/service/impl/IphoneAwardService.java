package com.lomtom.demo_0_4.service.impl;


import com.lomtom.demo_0_4.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 16:55
 **/
public class IphoneAwardService implements AwardService {
    private String award = "Iphone 12";
    @Override
    public void getAward(String username){
        System.out.println(username + "获得了" + award);
    }
}
