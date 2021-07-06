package com.lomtom.demo_2_1.material;

/**
 * @author lomtom
 * @date 2021/6/30 14:55
 **/
public class Battery implements Cloneable{
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
        return "我有一块容量为" + capacity +"的电池";
    }

    @Override
    public Battery clone(){
        Battery battery = null;
        try {
             battery = (Battery)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  battery;
    }
}
