package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.TabletPC.*;

public class TabletPC extends Appliance {
    private String batCap;
    private String disInch;
    private String memRom;
    private String flashMemCap;
    private String color;

    public TabletPC(Map<String, String> mapCriteria) {
        this.batCap = mapCriteria.get(BATTERY_CAPACITY.name());
        this.disInch = mapCriteria.get(DISPLAY_INCHES.name());
        this.memRom = mapCriteria.get(MEMORY_ROM.name());
        this.flashMemCap = mapCriteria.get(FLASH_MEMORY_CAPACITY.name());
        this.color = mapCriteria.get(COLOR.name());
    }

    @Override
    public String toString() {
        return "TabletPC: " + "batCap=" + batCap + ", disInch=" + disInch + ", memRom=" + memRom +
                ", flashMemCap=" + flashMemCap + ", color=" + color;
    }
}
