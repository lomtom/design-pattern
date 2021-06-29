package com.lomtom.demo_0_5.factory;

import com.lomtom.demo_0_5.factory.impl.jd.JdAwardFactory;
import com.lomtom.demo_0_5.factory.impl.taobao.TaobaoAwardFactory;

/**
 * @author lomtom
 * @date 2021/6/26 9:48
 **/
public class FactoryFactory {
    public static AwardFactory createAwardFactory(Integer factoryNumber) {
        if (factoryNumber == 1){
            return new JdAwardFactory();
        }else{
            return new TaobaoAwardFactory();
        }
    }
}
