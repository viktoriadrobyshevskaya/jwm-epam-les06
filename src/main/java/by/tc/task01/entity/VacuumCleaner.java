package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.*;

public class VacuumCleaner extends Appliance {
    private int powCons;
    private String filType;
    private String bagType;
    private String wandType;
    private int motSpeedReg;
    private int cleanWidth;

    public VacuumCleaner(Map<String, String> properties) {
        this.powCons = Integer.parseInt(properties.get(POWER_CONSUMPTION.name()));
        this.filType = properties.get(FILTER_TYPE.name());
        this.bagType = properties.get(BAG_TYPE.name());
        this.wandType = properties.get(WAND_TYPE.name());
        this.motSpeedReg = Integer.parseInt(properties.get(MOTOR_SPEED_REGULATION.name()));
        this.cleanWidth = (Integer.parseInt(properties.get(CLEANING_WIDTH.name())));
    }

    @Override
    public String toString() {
        return "VacuumCleaner: " + "powCons=" + powCons + ", filType=" + filType + ", bagType=" + bagType +
                ", wandType=" + wandType + ", motSpeedReg=" + motSpeedReg + ", cleanWidth=" + cleanWidth;
    }
}
