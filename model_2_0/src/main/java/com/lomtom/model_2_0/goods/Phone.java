package com.lomtom.model_2_0.goods;

import com.lomtom.model_2_0.material.Battery;
import com.lomtom.model_2_0.material.Cpu;
import com.lomtom.model_2_0.material.Screen;

import java.util.Objects;

/**
 * @author lomtom
 * @date 2021/6/30 14:58
 **/


public class Phone implements Cloneable{
    private Battery battery;

    private Cpu cpu;

    private Screen screen;

    /**
     * 能耗
     */
    private Integer energyConsumption;

    private String label;

    public Phone(Battery battery, Cpu cpu, Screen screen, Integer energyConsumption, String label) {
        this.battery = battery;
        this.cpu = cpu;
        this.screen = screen;
        this.energyConsumption = energyConsumption;
        this.label = label;
    }

    public Phone(Phone phone) {
        if (phone!=null){
            this.battery = phone.getBattery();
            this.cpu = phone.getCpu();
            this.screen = phone.getScreen();
            this.energyConsumption = phone.getEnergyConsumption();
            this.label = phone.getLabel();
        }
    }

    public void print() {
        System.out.println(
                "电池信息：" + battery +
                ", 处理器：" + cpu +
                ", 屏幕：" + screen +
                ", 能耗：" + energyConsumption + "mA/小时" +
                ", 续航：" + (double)battery.getCapacity()/energyConsumption + "小时" +
                ", " + label);
    }


    @Override
    public Phone clone(){
        return new Phone(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return Objects.equals(battery, phone.battery) && Objects.equals(cpu, phone.cpu) && Objects.equals(screen, phone.screen) && Objects.equals(energyConsumption, phone.energyConsumption) && Objects.equals(label, phone.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(battery, cpu, screen, energyConsumption, label);
    }

    public Battery getBattery() {
        return battery;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Screen getScreen() {
        return screen;
    }

    public Integer getEnergyConsumption() {
        return energyConsumption;
    }

    public String getLabel() {
        return label;
    }
}
