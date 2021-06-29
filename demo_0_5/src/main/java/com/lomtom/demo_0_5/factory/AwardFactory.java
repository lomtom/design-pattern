package com.lomtom.demo_0_5.factory;


import com.lomtom.demo_0_5.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public interface AwardFactory {
    AwardService getAward(Integer awardNumber);
}

