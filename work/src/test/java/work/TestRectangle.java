package work;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRectangle {

	@Test
	public void testOne() {
		Rectangle test1 = new Rectangle(2,4);
		int r1 = test1.area();
		assertEquals(8,r1);
		}
	@Test
	public void testTwo() {
		Rectangle test1 = new Rectangle(2,4);
		Rectangle test2 = new Rectangle(4,8);
		assertNotEquals(test1, test2);
		int r1 = test1.area();
		int r2  =test2.area();
		assertNotEquals(r1,r2);
		}
	@Test
	public void testThree() {
		Rectangle test1 = new Rectangle(2,4);
		Rectangle test2 = new Rectangle(4,2);
		assertNotEquals(test1, test2);
		int r1 = test1.area();
		int r2  =test2.area();
		assertEquals(r1,r2);
		}
	
	
}
