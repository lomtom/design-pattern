package com.lomtom.demo_0_2.factory;

import com.lomtom.demo_0_2.service.AwardService;
import com.lomtom.demo_0_2.service.impl.CashAwardService;
import com.lomtom.demo_0_2.service.impl.IphoneAwardService;
import com.lomtom.demo_0_2.service.impl.MallCardAwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public class AwardFactory {
    public AwardService getAwardService(Integer awardNumber) {
        if (awardNumber == 1){
           return new MallCardAwardService();
        }else if (awardNumber == 2){
            return new IphoneAwardService();
        }else{
            return new CashAwardService();
        }
    }
}

