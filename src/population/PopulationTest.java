package population;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PopulationTest {
	private Person[] people1 = {
			new Person(2001,2050),
			new Person(2005,2055),
			new Person(2050,2100),
			new Person(2055,2105),
			new Person(2056,2090)
	};

	private Person[] people2 = {
			new Person(2001,2005),
			new Person(2005,2010),
			new Person(2007,2015),
			new Person(2016,2020),
			new Person(2017,2021),
			new Person(2018,2022)
	};

	private Person[] people3 = {
			new Person(2000,2010),
			new Person(1975,2005),
			new Person(1975,2003),
			new Person(1803,1809),
			new Person(1750,1869),
			new Person(1840,1935),
			new Person(1803,1921),
			new Person(1894,1921)
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
		assertEquals(2050, Population.maxPopulationYear(people1));
		assertEquals(2018, Population.maxPopulationYear(people2));
		assertEquals(0, Population.maxPopulationYear(people3));
	}

}
