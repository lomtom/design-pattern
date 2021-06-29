package com.lomtom.demo_0_4.factory;


import com.lomtom.demo_0_4.handler.FactoryHandler;
import com.lomtom.demo_0_4.service.AwardService;
import com.lomtom.demo_0_4.service.impl.CashAwardService;
import com.lomtom.demo_0_4.service.impl.IphoneAwardService;
import com.lomtom.demo_0_4.service.impl.MallCardAwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public class AwardFactory {
    public static AwardService createService(Integer awardNumber){
        AwardService service = null;
        if (awardNumber == 1){
            service = FactoryHandler.getAward(MallCardAwardService.class);
        }else if (awardNumber == 2){
            service = FactoryHandler.getAward(IphoneAwardService.class);
        }else{
            service = FactoryHandler.getAward(CashAwardService.class);
        }
        return service;
    }
}

