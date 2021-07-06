package com.lomtom.demo_2_1;


import com.lomtom.demo_2_1.builders.impl.PhoneBuilder;
import com.lomtom.demo_2_1.director.Director;
import com.lomtom.demo_2_1.goods.Phone;
import com.lomtom.demo_2_1.material.Screen;

import java.util.Arrays;

/**
 * @author lomtom
 * @date 2021/6/30 16:33
 **/
public class Test {

    public static void main(String[] args) {

        Director director = new Director();
        PhoneBuilder builder = new PhoneBuilder();
        director.constructAndroid(builder);
        Phone phone = builder.ConstructPhone(600, "我小米安卓机皇吊打一切！！！");
        Phone phone1 = builder.ConstructPhone(600, "我小米安卓机皇吊打一切！！！");

        isSame(phone.equals(phone1));

        phone.print();
        phone1.print();

        Screen screen = phone.getScreen();
        screen.setBrand("三星");
        phone.setScreen(screen);


        System.out.println("修改之后");
        phone.print();
        phone1.print();
    }

    public static void isSame(Boolean flag){
        if (flag){
            System.out.println("这是我的复制品！！！");
        }else{
            System.out.println("这不是我的复制品！！！");
        }
    }
}
