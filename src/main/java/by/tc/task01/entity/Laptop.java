package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Laptop.*;

public class Laptop extends Appliance {
    private String batCap;
    private String os;
    private String memRom;
    private String sysMem;
    private String cpu;
    private String disp;

    public Laptop(Map<String, String> mapCriteria) {
        this.batCap = mapCriteria.get(BATTERY_CAPACITY.name());
        this.os = mapCriteria.get(OS.name());
        this.memRom = mapCriteria.get(MEMORY_ROM.name());
        this.sysMem = mapCriteria.get(SYSTEM_MEMORY.name());
        this.cpu = mapCriteria.get(CPU.name());
        this.disp = mapCriteria.get(DISPLAY_INCHS.name());
    }

    @Override
    public String toString() {
        return "Laptop: " + "batCap=" + batCap + ", os=" + os + ", memRom=" + memRom + ", sysMem=" + sysMem +
                ", cpu=" + cpu + ", disp=" + disp;
    }
}
