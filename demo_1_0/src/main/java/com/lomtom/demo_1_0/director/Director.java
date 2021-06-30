package com.lomtom.demo_1_0.director;

import com.lomtom.demo_1_0.builders.Builder;

/**
 * @author lomtom
 * @date 2021/6/30 15:19
 **/
public class Director {

    public void constructAndroid(Builder builder){
        builder.setCpu("骁龙","888");
        builder.setScreen("京东方","LCD");
        builder.setBattery(5000);
    }

    public void constructApply(Builder builder){
        builder.setCpu("apply","A14");
        builder.setScreen("三星","AMOLED");
        builder.setBattery(2000);
    }
}
