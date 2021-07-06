package com.lomtom.demo_2_1.material;

/**
 * @author lomtom
 * @date 2021/6/30 14:56
 **/
public class Cpu implements Cloneable{
    /**
     * 品牌
     */
    private String brand;

    /**
     * 型号
     */
    private String model;

    public Cpu(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "我有一块产自" + brand + "的" + model +"的处理器";
    }

    @Override
    public Cpu clone(){
        Cpu cpu = null;
        try {
            cpu =  (Cpu)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cpu;
    }
}
