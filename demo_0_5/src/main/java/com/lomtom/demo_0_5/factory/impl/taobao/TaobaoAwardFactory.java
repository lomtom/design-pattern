package com.lomtom.demo_0_5.factory.impl.taobao;


import com.lomtom.demo_0_5.service.AwardService;
import com.lomtom.demo_0_5.service.impl.taobao.CashAwardService;
import com.lomtom.demo_0_5.service.impl.taobao.IphoneAwardService;
import com.lomtom.demo_0_5.service.impl.taobao.MallCardAwardService;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public class TaobaoAwardFactory implements com.lomtom.demo_0_5.factory.AwardFactory {

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

