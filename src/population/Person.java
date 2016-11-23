package population;

public class Person {
	private int birthYear = 0;
	private int deathYear = 0;
	
	public Person(int birthYear, int deathYear) {
		super();
		this.birthYear = birthYear;
		this.deathYear = deathYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public int getDeathYear() {
		return deathYear;
	}

}
