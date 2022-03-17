package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ApplianceDAOImpl implements ApplianceDAO {
    private static final String path = "src/main/resources/appliances_db.txt";

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<String> appliances = findAppliancesWeNeed(criteria);

        List<String> modifiedCriteria = criteria.getCriteria().entrySet().stream()
                .map(c -> c.getKey() + "=" + c.getValue()).collect(Collectors.toList());

        return appliances.stream()
                .filter(appliance -> modifiedCriteria.stream().allMatch(cr -> isContained(appliance, cr)))
                .map(line -> parseLineToAppliance(line, criteria.getGroupSearchName()))
                .collect(Collectors.toList());
    }

    private Appliance parseLineToAppliance(String line, String groupSearchName) {
        Map<String, String> mapCriteria = Arrays.stream(line.split(",")).map(value -> value.split("="))
                .collect(Collectors.toMap(entry -> entry[0].trim(), entry -> entry[1].trim()));

        switch (groupSearchName) {
            case "Laptop":
                return new Laptop(mapCriteria);
            case "Oven":
                return new Oven(mapCriteria);
            case "Refrigerator":
                return new Refrigerator(mapCriteria);
            case "Speakers":
                return new Speakers(mapCriteria);
            case "TabletPC":
                return new TabletPC(mapCriteria);
            case "VacuumCleaner":
                return new VacuumCleaner(mapCriteria);
            default:
                return null;
        }
    }


    private boolean isContained(String appliance, String cr) {
        return Arrays.stream(appliance.split(","))
                .map(String::trim)
                .anyMatch(value -> value.equalsIgnoreCase(cr));
    }

    public List<String> findAppliancesWeNeed(Criteria criteria) {
        List<String> appliancesWeNeed = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                if (line.contains(criteria.getGroupSearchName())) {
                    String[] tmp = line.split(" : ");
                    appliancesWeNeed.add(tmp[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return appliancesWeNeed;
    }


}
