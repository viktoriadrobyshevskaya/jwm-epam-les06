package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner.*;

public class VacuumCleaner extends Appliance {
    private String powCons;
    private String filType;
    private String bagType;
    private String wandType;
    private String motSpeedReg;
    private String cleanWidth;

    public VacuumCleaner(Map<String, String> mapCriteria) {
        this.powCons = mapCriteria.get(POWER_CONSUMPTION.name());
        this.filType = mapCriteria.get(FILTER_TYPE.name());
        this.bagType = mapCriteria.get(BAG_TYPE.name());
        this.wandType = mapCriteria.get(WAND_TYPE.name());
        this.motSpeedReg = mapCriteria.get(MOTOR_SPEED_REGULATION.name());
        this.cleanWidth = mapCriteria.get(CLEANING_WIDTH.name());
    }

    @Override
    public String toString() {
        return "VacuumCleaner: " + "powCons=" + powCons + ", filType=" + filType + ", bagType=" + bagType +
                ", wandType=" + wandType + ", motSpeedReg=" + motSpeedReg + ", cleanWidth=" + cleanWidth;
    }
}
