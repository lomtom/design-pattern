package com.lomtom.demo_0_4.handler;

import com.lomtom.demo_0_4.service.AwardService;

/**
 * @author lomtom
 * @date 2021/6/26 10:29
 **/
public class FactoryHandler {
    public static <T extends AwardService>T getAward(Class<T> tClass) {
        T t = null;
        try {
            t = (T) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return t;
    }
}
