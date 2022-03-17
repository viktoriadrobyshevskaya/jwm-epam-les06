package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Refrigerator.*;

public class Refrigerator extends Appliance {
    private String powCon;
    private String weight;
    private String freezCap;
    private String overCap;
    private String height;
    private String width;

    public Refrigerator(Map<String, String> mapCriteria) {
        this.powCon = mapCriteria.get(POWER_CONSUMPTION.name());
        this.weight = mapCriteria.get(WEIGHT.name());
        this.freezCap = mapCriteria.get(FREEZER_CAPACITY.name());
        this.overCap = mapCriteria.get(OVERALL_CAPACITY.name());
        this.height = mapCriteria.get(HEIGHT.name());
        this.width = mapCriteria.get(WIDTH.name());
    }

    @Override
    public String toString() {
        return "Refrigerator: " + "powCon=" + powCon + ", weight=" + weight + ", freezCap=" + freezCap +
                ", overCap=" + overCap + ", height=" + height + ", width=" + width;

    }
}
