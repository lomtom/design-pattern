package com.lomtom.demo_0_0;

import com.lomtom.demo_0_0.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 16:53
 **/
public class Test {

    public static void main(String[] args) {
        int index = 0;
        while(index++ < 10) {
            String employee = "小葛";
            System.out.print(employee + "抽奖兑换------    ");
            AwardService service = new AwardService();
            service.getAward(employee);
        }
    }
}
