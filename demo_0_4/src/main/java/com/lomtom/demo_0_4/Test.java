package com.lomtom.demo_0_4;


import com.lomtom.demo_0_4.factory.AwardFactory;
import com.lomtom.demo_0_4.service.AwardService;

import java.util.Random;

/**
 * @author lomtom
 * @date 2021/6/24 16:53
 **/
public class Test {

    public static void main(String[] args) {
        int index = 0;
        while(index++ < 10) {
            String employee = "小葛";
            //小葛随机获得奖品
            Random random = new Random();
            Integer awardNumber = random.nextInt(3);
            System.out.print(employee + "抽奖兑换------    ");
            AwardService service = AwardFactory.createService(awardNumber);
            service.getAward(employee);
        }
    }
}
