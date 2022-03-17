package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.*;

public class Speakers extends Appliance {
    private int powCons;
    private int numSpeak;
    private String freqRange;
    private int cordLen;

    public Speakers(Map<String, String> properties) {
        this.powCons = Integer.parseInt(properties.get(POWER_CONSUMPTION.name()));
        this.numSpeak = Integer.parseInt(properties.get(NUMBER_OF_SPEAKERS.name()));
        this.freqRange = properties.get(FREQUENCY_RANGE.name());
        this.cordLen = Integer.parseInt(properties.get(CORD_LENGTH.name()));
    }

    @Override
    public String toString() {
        return "Speakers: " + "powCons=" + powCons + ", numSpeak=" + numSpeak + ", freqRange=" + freqRange + ", cordLen=" + cordLen;
    }
}
