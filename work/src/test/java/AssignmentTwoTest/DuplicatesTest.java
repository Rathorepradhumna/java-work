package AssignmentTwoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentTwo.Duplicates;

public class DuplicatesTest {
	Duplicates test = new Duplicates();
	@Test
	public void testOne() {
		
	    assertEquals(0,test.findDuplicates("abcde"));
	}

	@Test
	public void testTwo() {
	    assertEquals(2,test.findDuplicates("aabbcde"));
	}
	@Test
	public void testThree() {
	    assertEquals(2,test.findDuplicates("aabbcde"));
	}
	@Test
	public void testFour() {
	    assertEquals(1,test.findDuplicates("indivisibility"));
	}
	@Test
	public void testFive() {
	    assertEquals(2,test.findDuplicates("Indivisibilities"));
	}
	
	@Test
	public void testSix() {
	    assertEquals(2,test.findDuplicates("aA11"));
	}
	@Test
	public void testSeven() {
	    assertEquals(2,test.findDuplicates("ABBA"));
	}
	
	
	
}

