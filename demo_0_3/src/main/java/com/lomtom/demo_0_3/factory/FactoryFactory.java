package com.lomtom.demo_0_3.factory;


import com.lomtom.demo_0_3.factory.impl.CashAwardFactory;
import com.lomtom.demo_0_3.factory.impl.IphoneAwardFactory;
import com.lomtom.demo_0_3.factory.impl.MallCardAwardFactory;

/**
 * @author lomtom
 * @date 2021/6/24 17:59
 **/
public class FactoryFactory {
    public static AwardFactory createFactory(Integer awardNumber) {
        AwardFactory factory;
        if (awardNumber == 1){
            factory = new MallCardAwardFactory();
        }else if (awardNumber == 2){
            factory = new IphoneAwardFactory();
        }else{
            factory = new CashAwardFactory();
        }
        return factory;
    }
}

