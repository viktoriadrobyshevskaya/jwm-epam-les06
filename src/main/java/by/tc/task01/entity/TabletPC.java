package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC.*;

public class TabletPC extends Appliance {
    private int batCap;
    private int disInch;
    private int memRom;
    private int flashMemCap;
    private String color;

    public TabletPC(Map<String, String> properties) {
        this.batCap = Integer.parseInt(properties.get(BATTERY_CAPACITY.name()));
        this.disInch = Integer.parseInt(properties.get(DISPLAY_INCHES.name()));
        this.memRom = Integer.parseInt(properties.get(MEMORY_ROM.name()));
        this.flashMemCap = Integer.parseInt(properties.get(FLASH_MEMORY_CAPACITY.name()));
        this.color = properties.get(COLOR.name());
    }

    @Override
    public String toString() {
        return "TabletPC: " + "batCap=" + batCap + ", disInch=" + disInch + ", memRom=" + memRom +
                ", flashMemCap=" + flashMemCap + ", color=" + color;
    }
}
