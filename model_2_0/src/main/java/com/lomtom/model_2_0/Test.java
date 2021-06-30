package com.lomtom.model_2_0;

import com.lomtom.model_2_0.builders.impl.PhoneBuilder;
import com.lomtom.model_2_0.director.Director;
import com.lomtom.model_2_0.goods.Phone;

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
        Phone phone1 = builder.ConstructPhone(800, "我华为安卓机皇吊打一切！！！");
        Phone phone2 = builder.ConstructPhone(800, "我华为安卓机皇吊打一切！！！");
        Phone phone3 = builder.ConstructPhone(600, "我小米安卓机皇吊打一切！！！");

        isSame(phone,phone3);
        isSame(phone,phone2);
        isSame(phone1,phone2);
        isSame(phone1,phone3);

        phone.print();
        phone1.print();
    }

    public static void isSame(Phone p1,Phone p2){
        if (p1.equals(p2)){
            System.out.println("这是我的复制品！！！");
        }else{
            System.out.println("这不是我的复制品！！！");
        }
    }
}
