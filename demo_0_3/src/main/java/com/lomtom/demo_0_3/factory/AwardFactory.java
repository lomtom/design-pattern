package com.lomtom.demo_0_3.factory;


import com.lomtom.demo_0_3.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public interface AwardFactory {
    AwardService getAwardService(Integer awardNumber);
}

