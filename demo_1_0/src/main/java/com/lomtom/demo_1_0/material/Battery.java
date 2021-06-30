package com.lomtom.demo_1_0.material;

import com.lomtom.demo_1_0.goods.Phone;

/**
 * @author lomtom
 * @date 2021/6/30 14:55
 **/
public class Battery {
    /**
     * 电池容量
     */
    private Integer capacity;

    public Battery(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "这是一块容量为" + capacity +"的电池";
    }
}
