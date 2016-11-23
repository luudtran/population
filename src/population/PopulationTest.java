package population;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PopulationTest {
	private Person[] people1 = {
			new Person(1,50),
			new Person(5,55),
			new Person(50,100),
			new Person(55,105),
			new Person(56,90)
	};

	private Person[] people2 = {
			new Person(1,5),
			new Person(5,10),
			new Person(7,15),
			new Person(16,20),
			new Person(17,21),
			new Person(18,22)
	};

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMaxPopulationYear() {
		assertEquals(50, Population.maxPopulationYear(people1));
		assertEquals(18, Population.maxPopulationYear(people2));
	}

}
