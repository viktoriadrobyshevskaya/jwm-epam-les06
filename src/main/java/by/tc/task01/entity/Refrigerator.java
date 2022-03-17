package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.*;

public class Refrigerator extends Appliance {
    private int powCon;
    private int weight;
    private int freezCap;
    private double overCap;
    private int height;
    private int width;

    public Refrigerator(Map<String, String> properties) {
        this.powCon = Integer.parseInt(properties.get(POWER_CONSUMPTION.name()));
        this.weight = Integer.parseInt(properties.get(WEIGHT.name()));
        this.freezCap = Integer.parseInt(properties.get(FREEZER_CAPACITY.name()));
        this.overCap = Double.parseDouble(properties.get(OVERALL_CAPACITY.name()));
        this.height = Integer.parseInt(properties.get(HEIGHT.name()));
        this.width = Integer.parseInt(properties.get(WIDTH.name()));
    }

    @Override
    public String toString() {
        return "Refrigerator: " + "powCon=" + powCon + ", weight=" + weight + ", freezCap=" + freezCap +
                ", overCap=" + overCap + ", height=" + height + ", width=" + width;

    }
}
