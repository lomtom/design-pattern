package com.lomtom.demo_0_5;


import com.lomtom.demo_0_5.factory.AwardFactory;
import com.lomtom.demo_0_5.factory.FactoryFactory;
import com.lomtom.demo_0_5.service.AwardService;

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
            Random random = new Random();
            //小葛随机去平台进行抽奖
            Integer factoryNumber = random.nextInt(2);
            //小葛随机获得奖品
            Integer awardNumber = random.nextInt(3);
            System.out.print(employee + "抽奖兑换------    ");

            AwardFactory factory = FactoryFactory.createAwardFactory(factoryNumber);
            AwardService service = factory.getAwardService(awardNumber);
            service.getAward(employee);

        }

    }
}
