package com.lomtom.demo_0_5.service.impl.jd;


import com.lomtom.demo_0_5.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 16:55
 **/
public class IphoneAwardService implements AwardService {
    private String award = "jd     ---- Iphone 12";
    @Override
    public void getAward(String username){
        System.out.println(username + "获得了" + award);
    }
}
