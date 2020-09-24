import static org.junit.Assert.*;

import org.junit.Test;

public class TestZeroToEnd {

	@Test
	public void testOne() {
		ZerosToEnd test1 = new ZerosToEnd();
		int arr[] = {1,5,11,0,8,6};
		int a1[] = test1.move(arr);
		int expected[] = {1,5,11,8,6,0};
		assertArrayEquals(expected,a1);
	}
	@Test
	public void testTwo() {
		ZerosToEnd test1 = new ZerosToEnd();
		int arr[] = {1,5,11,58,84,64,0,0,7,65};
		int a1[] = test1.move(arr);
		int expected[] = {1,5,11,58,84,64,7,65,0,0};
		assertArrayEquals(expected,a1);
	}

}
