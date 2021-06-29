package com.lomtom.demo_0_3.factory.impl;

import com.lomtom.demo_0_3.factory.AwardFactory;
import com.lomtom.demo_0_3.service.AwardService;
import com.lomtom.demo_0_3.service.impl.MallCardAwardService;

/**
 * @author lomtom
 * @date 2021/6/25 9:22
 **/
public class MallCardAwardFactory implements AwardFactory {
    @Override
    public AwardService getAward(Integer awardNumber) {
        return new MallCardAwardService();
    }
}
