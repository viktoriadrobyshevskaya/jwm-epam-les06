package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

public class Validator {

	private static final List<String> groupSearchName = List.of("Laptop", "Oven", "Refrigerator", "Speakers", "TabletPC", "VacuumCleaner");

	public static boolean criteriaValidator(Criteria criteria) {
		boolean valid = criteria.getGroupSearchName() != null && !criteria.getGroupSearchName().isEmpty();

		return valid && groupSearchName.stream().anyMatch(s -> criteria.getGroupSearchName().contains(s));
	}
}

