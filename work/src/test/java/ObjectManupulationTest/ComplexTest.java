package ObjectManupulationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import objectManupulation.Complex;
import objectManupulation.Distance;

public class ComplexTest {

	@Test
	public void testOne() {
		Complex t1 = new Complex();
		Complex t2 = new Complex();
		Complex t3 = new Complex();
		t1.set(4.0f, 2.0f);
		t2.set(5.0f, 3.7f);
		t3  = t2.sum(t1);
		t3.display();
		String actual = t3.getReal()+" + i"+t3.getImg();
		assertEquals("9.0 + i5.7",actual);
	}
	@Test
	public void testTwo() {
		Complex t1 = new Complex();
		Complex t2 = new Complex();
		Complex t3 = new Complex();
		t1.set(2.0f, 8.0f);
		t2.set(7.0f, 12.0f);
		t3  = t2.sum(t1);
		t3.display();
		String actual = t3.getReal()+" + i"+t3.getImg();
		assertEquals("9.0 + i20.0",actual);
	}

}
