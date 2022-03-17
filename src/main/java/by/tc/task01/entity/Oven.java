package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Oven.*;

public class Oven extends Appliance {
    private int powCon;
    private int weight;
    private int capacity;
    private int depth;
    private double height;
    private double width;

    public Oven(Map<String, String> properties) {
        this.powCon = Integer.parseInt(properties.get(POWER_CONSUMPTION.name()));
        this.weight = Integer.parseInt(properties.get(WEIGHT.name()));
        this.capacity = Integer.parseInt(properties.get(CAPACITY.name()));
        this.depth = Integer.parseInt(properties.get(DEPTH.name()));
        this.height = Double.parseDouble(properties.get(HEIGHT.name()));
        this.width = Double.parseDouble(properties.get(WIDTH.name()));
    }

    @Override
    public String toString() {
        return "Oven: " + "powCon=" + powCon + ", weight=" + weight + ", capacity=" + capacity + ", depth=" + depth +
                ", height=" + height + ", width=" + width;
    }
}
