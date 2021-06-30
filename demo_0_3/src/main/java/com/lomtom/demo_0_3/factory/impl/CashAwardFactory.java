package com.lomtom.demo_0_3.factory.impl;

import com.lomtom.demo_0_3.factory.AwardFactory;
import com.lomtom.demo_0_3.service.AwardService;
import com.lomtom.demo_0_3.service.impl.CashAwardService;

/**
 * @author lomtom
 * @date 2021/6/25 9:20
 **/
public class CashAwardFactory implements AwardFactory {

    @Override
    public AwardService getAwardService(Integer awardNumber) {
        return new CashAwardService();
    }
}
