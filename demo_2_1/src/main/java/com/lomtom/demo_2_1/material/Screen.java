package com.lomtom.demo_2_1.material;

/**
 * @author lomtom
 * @date 2021/6/30 14:55
 **/
public class Screen implements Cloneable{
    /**
     * 品牌
     */
    private String brand;

    /**
     * 分辨率
     */
    private String resolution;

    public Screen(String brand, String resolution) {
        this.brand = brand;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "我有一块产自" + brand + "的" + resolution +"屏幕";
    }

    @Override
    public Screen clone(){
        Screen screen = null;
        try {
             screen = (Screen)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return screen;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
