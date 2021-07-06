package com.lomtom.demo_2_0.goods;

import com.lomtom.demo_2_0.material.Battery;
import com.lomtom.demo_2_0.material.Cpu;
import com.lomtom.demo_2_0.material.Screen;

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

    public Phone() {
    }

    public Phone(Battery battery, Cpu cpu, Screen screen, Integer energyConsumption, String label) {
        this.battery = battery;
        this.cpu = cpu;
        this.screen = screen;
        this.energyConsumption = energyConsumption;
        this.label = label;
    }

    public void print() {
        System.out.println(
                this +
                ", 电池信息：" + battery +
                ", 处理器：" + cpu +
                ", 屏幕：" + screen +
                ", 能耗：" + energyConsumption + "mA/小时" +
                ", 续航：" + (double)battery.getCapacity()/energyConsumption + "小时" +
                ", " + label);
    }


    @Override
    public Phone clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Phone) clone;
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


    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }
}
