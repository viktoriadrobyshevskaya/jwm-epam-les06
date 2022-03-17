package by.tc.task01.entity;

import java.util.Map;

import static by.tc.task01.entity.criteria.SearchCriteria.Speakers.*;

public class Speakers extends Appliance {
    private String powCons;
    private String numSpeak;
    private String freqRange;
    private String cordLen;

    public Speakers(Map<String, String> mapCriteria) {
        this.powCons = mapCriteria.get(POWER_CONSUMPTION.name());
        this.numSpeak = mapCriteria.get(NUMBER_OF_SPEAKERS.name());
        this.freqRange = mapCriteria.get(FREQUENCY_RANGE.name());
        this.cordLen = mapCriteria.get(CORD_LENGTH.name());
    }

    @Override
    public String toString() {
        return "Speakers: " + "powCons=" + powCons + ", numSpeak=" + numSpeak + ", freqRange=" + freqRange + ", cordLen=" + cordLen;
    }
}
