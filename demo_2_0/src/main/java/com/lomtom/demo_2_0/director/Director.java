package com.lomtom.demo_2_0.director;


import com.lomtom.demo_2_0.builders.Builder;

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


    public void constructApple(Builder builder){
        builder.setCpu("apple","A14");
        builder.setScreen("三星","AMOLED");
        builder.setBattery(2000);
    }
}
