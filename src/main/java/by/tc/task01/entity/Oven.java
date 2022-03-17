package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven.*;

public class Oven extends Appliance {
    private String powCon;
    private String weight;
    private String capacity;
    private String depth;
    private String height;
    private String width;

    public Oven(Map<String, String> mapCriteria) {
        this.powCon = mapCriteria.get(POWER_CONSUMPTION.name());
        this.weight = mapCriteria.get(WEIGHT.name());
        this.capacity = mapCriteria.get(CAPACITY.name());
        this.depth = mapCriteria.get(DEPTH.name());
        this.height = mapCriteria.get(HEIGHT.name());
        this.width = mapCriteria.get(WIDTH.name());
    }

    @Override
    public String toString() {
        return "Oven: " + "powCon=" + powCon + ", weight=" + weight + ", capacity=" + capacity + ", depth=" + depth +
                ", height=" + height + ", width=" + width;
    }
}
