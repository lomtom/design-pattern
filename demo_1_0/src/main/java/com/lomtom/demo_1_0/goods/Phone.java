package com.lomtom.demo_1_0.goods;

import com.lomtom.demo_1_0.material.Battery;
import com.lomtom.demo_1_0.material.Cpu;
import com.lomtom.demo_1_0.material.Screen;

/**
 * @author lomtom
 * @date 2021/6/30 14:58
 **/


public class Phone {
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
}
