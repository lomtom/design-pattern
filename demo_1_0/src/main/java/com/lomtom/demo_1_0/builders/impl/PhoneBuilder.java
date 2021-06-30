package com.lomtom.demo_1_0.builders.impl;

import com.lomtom.demo_1_0.builders.Builder;
import com.lomtom.demo_1_0.goods.Phone;
import com.lomtom.demo_1_0.material.Battery;
import com.lomtom.demo_1_0.material.Cpu;
import com.lomtom.demo_1_0.material.Screen;

/**
 * @author lomtom
 * @date 2021/6/30 15:11
 **/
public class PhoneBuilder implements Builder {

    private Battery battery;

    private Cpu cpu;

    private Screen screen;

    @Override
    public void setCpu(String brand, String model) {
       this.cpu = new Cpu(brand,model);
    }

    @Override
    public void setScreen(String brand, String resolution) {
        this.screen = new Screen(brand, resolution);
    }

    @Override
    public void setBattery(Integer capacity) {
        this.battery = new Battery(capacity);
    }

    public Phone ConstructPhone(Integer energyConsumption,String label){
        return new Phone(battery,cpu,screen,energyConsumption,label);
    }
}
