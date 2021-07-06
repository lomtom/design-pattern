package com.lomtom.demo_2_1.builders.impl;



import com.lomtom.demo_2_1.builders.Builder;
import com.lomtom.demo_2_1.goods.Phone;
import com.lomtom.demo_2_1.material.Battery;
import com.lomtom.demo_2_1.material.Cpu;
import com.lomtom.demo_2_1.material.Screen;


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

    private Phone cache = null;


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

    public Phone ConstructPhone(Integer energyConsumption, String label) {
        if (this.cache != null){
            return this.cache.clone();
        }
        this.energyConsumption = energyConsumption;
        this.lable = label;
        Phone phone =new Phone(battery, cpu, screen, energyConsumption, label);
        this.cache = phone;
        return phone;
    }

    public Phone getCache() {
        return cache;
    }
}