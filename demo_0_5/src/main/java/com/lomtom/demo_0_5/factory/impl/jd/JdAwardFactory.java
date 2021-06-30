package com.lomtom.demo_0_5.factory.impl.jd;

import com.lomtom.demo_0_5.factory.AwardFactory;
import com.lomtom.demo_0_5.service.AwardService;
import com.lomtom.demo_0_5.service.impl.jd.CashAwardService;
import com.lomtom.demo_0_5.service.impl.jd.IphoneAwardService;
import com.lomtom.demo_0_5.service.impl.jd.MallCardAwardService;

/**
 * @author lomtom
 * @date 2021/6/26 9:51
 **/
public class JdAwardFactory implements AwardFactory {

    @Override
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
