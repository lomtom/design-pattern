package com.lomtom.demo_1_0;

import com.lomtom.demo_1_0.builders.Builder;
import com.lomtom.demo_1_0.builders.impl.PhoneBuilder;
import com.lomtom.demo_1_0.director.Director;
import com.lomtom.demo_1_0.goods.Phone;

/**
 * @author lomtom
 * @date 2021/6/30 13:53
 **/
public class Test {
    public static void main(String[] args) {

        Director director = new Director();
        PhoneBuilder builder = new PhoneBuilder();
        director.constructAndroid(builder);
        Phone phone = builder.ConstructPhone(800,"我安卓机皇吊打一切！！！");
        phone.print();

        PhoneBuilder builder1 = new PhoneBuilder();
        director.constructApply(builder1);
        Phone phone1 = builder1.ConstructPhone(600,"我苹果无所畏惧！！！");
        phone1.print();
    }
}
