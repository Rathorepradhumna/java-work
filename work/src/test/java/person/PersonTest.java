package person;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testOne() {
		Person p1 = new Person("Ram", 5, 6, 1980);
		Person p2 = new Person("Shyam", 2, 3, 1987);
		assertEquals("Ram is older than Shyam by 6 years 8 months 25 days",p2.olderPerson(p1));
		
	}
	@Test
	public void testTwo() {
		Person p1 = new Person("Pradhumna", 26, 8, 1998);
		Person p2 = new Person("Namrata", 8, 6, 1998);
		assertEquals("Namrata is older than Pradhumna by 0 years 2 months 18 days",p2.olderPerson(p1));
		
	}
}
