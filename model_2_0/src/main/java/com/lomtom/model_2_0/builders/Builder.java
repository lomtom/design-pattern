package com.lomtom.model_2_0.builders;

/**
 * @author lomtom
 * @date 2021/6/30 15:11
 **/
public interface Builder {
    /**
     * 安装处理器
     * @param brand 处理器品牌
     * @param model 处理器型号
     */
    void setCpu(String brand,String model);

    /**
     * 安装屏幕
     * @param brand 屏幕品牌
     * @param resolution 屏幕分辨率
     */
    void setScreen(String brand,String resolution);

    /**
     * 安装电池
     * @param capacity 电池容量
     */
    void setBattery(Integer capacity);
}
