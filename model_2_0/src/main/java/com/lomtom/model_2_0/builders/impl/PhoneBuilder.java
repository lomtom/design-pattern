package com.lomtom.model_2_0.builders.impl;


import com.lomtom.model_2_0.builders.Builder;
import com.lomtom.model_2_0.goods.Phone;
import com.lomtom.model_2_0.material.Battery;
import com.lomtom.model_2_0.material.Cpu;
import com.lomtom.model_2_0.material.Screen;

import java.util.HashMap;

/**
 * @author lomtom
 * @date 2021/6/30 15:11
 **/
public class PhoneBuilder implements Builder {

    private Battery battery;

    private Cpu cpu;

    private Screen screen;

    private Integer energyConsumption;

    private String lable;

    private HashMap<String,Phone> cache = new HashMap<>();


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

    public Phone ConstructPhone(Integer energyConsumption, String label){
        if (this.equalsPhone(energyConsumption,label)){
            return this.cache.get(energyConsumption + label).clone();
        }
        this.energyConsumption = energyConsumption;
        this.lable = label;
        Phone phone = new Phone(battery, cpu, screen, energyConsumption, label);
        cache.put(energyConsumption + label,phone);
        return phone;
    }

    public boolean equalsPhone(Integer energyConsumption, String label){
        return this.cache.containsKey(energyConsumption + label);
    }
}
