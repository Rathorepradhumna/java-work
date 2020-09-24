import static org.junit.Assert.*;

import org.junit.Test;

public class TestMissing {

	@Test
	public void testOne() {
		//MissingElement test = new MissingElement();
		int arr [] = {1,2,3,4,6,7};
		int r = MissingElement.missing(arr);
		assertEquals(5,r);
	}
	@Test
	public void testTwo() {
		//MissingElement test = new MissingElement();
		int arr [] = {1,2,3,4,6,7,8,5,10};
		int r = MissingElement.missing(arr);
		assertEquals(9,r);
	}
	@Test
	public void testThree() {
		//MissingElement test = new MissingElement();
		int arr [] = {1,2,3,4,6,7,8,5,10,11,13,9};
		int r = MissingElement.missing(arr);
		assertEquals(12,r);
	}

}
