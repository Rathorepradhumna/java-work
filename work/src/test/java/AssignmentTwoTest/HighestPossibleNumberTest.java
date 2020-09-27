package AssignmentTwoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentTwo.HighestPossibleNumber;

public class HighestPossibleNumberTest {

	@Test
	public void testOne() {
		HighestPossibleNumber test = new HighestPossibleNumber();
		int actual = test.conversion(21445);
		assertEquals(54421,actual);
		
	}
	@Test
	public void testTwo() {
		HighestPossibleNumber test = new HighestPossibleNumber();
		int actual = test.conversion(145263);
		assertEquals(654321,actual);
		
	}
	



}
