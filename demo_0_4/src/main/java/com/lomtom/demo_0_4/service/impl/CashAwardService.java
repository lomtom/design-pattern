package com.lomtom.demo_0_4.service.impl;


import com.lomtom.demo_0_4.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:57
 **/
public class CashAwardService implements AwardService {
    private String award = "3000元 现金";
    @Override
    public void getAward(String username){
        System.out.println(username + "获得了" + award);
    }
}
