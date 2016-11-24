package population;

import java.util.HashMap;

public class Population {
	public static int maxPopulationYear(Person[] people) {
		HashMap<Integer, Integer> years = new HashMap<Integer, Integer>();
		int maxPopulationYear = 0;
		int maxPopulation = 0;
		
		for (int i = 0; i < people.length; i++) {
			int birthYear = people[i].getBirthYear();
			int deathYear = people[i].getDeathYear();
			for (int j = birthYear; j <= deathYear; j++) {
				Integer populationAtYear = years.get(Integer.valueOf(j));
				if (populationAtYear == null) {
					populationAtYear = Integer.valueOf(0);
					years.put(Integer.valueOf(j), populationAtYear);
				}
				populationAtYear = Integer.valueOf(populationAtYear.intValue() + 1);
				years.put(Integer.valueOf(j),  populationAtYear);
				if (maxPopulation < populationAtYear.intValue()) {
					maxPopulation = populationAtYear.intValue();
					maxPopulationYear = j;
				}
			}
		}
		
		System.out.println("maxPopulation: " + maxPopulation);
		System.out.println("maxPopulationYear: " + maxPopulationYear);
		
		return maxPopulationYear;
	}
}
