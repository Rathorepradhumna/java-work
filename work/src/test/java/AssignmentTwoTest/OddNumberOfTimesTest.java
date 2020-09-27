package AssignmentTwoTest;
import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentTwo.OddNumberOfTimes;

public class OddNumberOfTimesTest {

	@Test
	public void testOne() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
		int actual  = test.find(inp);
		assertEquals(5,actual);
	}
	@Test
	public void testTwo() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {1,1,2,-2,5,2,4,4,-1,-2,5};
		int actual  = test.find(inp);
		assertEquals(-1,actual);
	}
	@Test
	public void testThree() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {20,1,1,2,2,3,3,5,5,4,20,4,5};
		int actual  = test.find(inp);
		assertEquals(5,actual);
	}
	@Test
	public void testFour() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {10};
		int actual  = test.find(inp);
		assertEquals(10,actual);
	}
	@Test
	public void testFive() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {1,1,1,1,1,1,10,1,1,1,1};
		int actual  = test.find(inp);
		assertEquals(10,actual);
	}
	@Test
	public void testSix() {
		OddNumberOfTimes test = new OddNumberOfTimes();
		int inp[] = {5,4,3,2,1,5,4,3,2,10,10};
		int actual  = test.find(inp);
		assertEquals(1,actual);
	}
	
	
	
	


}
