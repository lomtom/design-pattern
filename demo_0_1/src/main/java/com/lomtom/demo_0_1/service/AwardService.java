package com.lomtom.demo_0_1.service;


/**
 * @author lomtom
 * @date 2021/6/24 16:55
 **/
public class AwardService {

    private String cashAward = "3000元 现金";
    private String mallCardAward = "Iphone 12";
    private String iphoneAward = "1000元 购物卡";

    public void getAward(String username,Integer awardNumber){
        if (awardNumber == 1){
            System.out.println(username + "获得了" + mallCardAward);
        }else if (awardNumber == 2){
            System.out.println(username + "获得了" + iphoneAward);
        }else{
            System.out.println(username + "获得了" + cashAward);
        }
    }
}
