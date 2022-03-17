package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop.*;

public class Laptop extends Appliance {
    private double batCap;
    private String os;
    private int memRom;
    private int sysMem;
    private double cpu;
    private int disp;

    public Laptop(Map<String, String> properties) {
        this.batCap = Double.parseDouble(properties.get(BATTERY_CAPACITY.name()));
        this.os = properties.get(OS.name());
        this.memRom = Integer.parseInt(properties.get(MEMORY_ROM.name()));
        this.sysMem = Integer.parseInt(properties.get(SYSTEM_MEMORY.name()));
        this.cpu = Double.parseDouble(properties.get(CPU.name()));
        this.disp = Integer.parseInt(properties.get(DISPLAY_INCHS.name()));
    }

    @Override
    public String toString() {
        return "Laptop: " + "batCap=" + batCap + ", os=" + os + ", memRom=" + memRom + ", sysMem=" + sysMem +
                ", cpu=" + cpu + ", disp=" + disp;
    }
}
