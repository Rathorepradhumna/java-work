package ObjectManupulationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import objectManupulation.Distance;

public class DistanceTest {

	@Test
	public void testOne() {
		Distance t1 = new Distance();
		Distance t2 = new Distance();
		Distance t3 = new Distance();
		t1.set(4, 2);
		t2.set(2, 5);
		t3  = t2.add(t1);
		//t3.display();
		
		String actual = (t3.getFeet()+","+t3.getInches()).toString();
		assertEquals("6,7.0",actual);
	}
	@Test
	public void testTwo() {
		Distance t1 = new Distance();
		Distance t2 = new Distance();
		Distance t3 = new Distance();
		t1.set(8, 2);
		t2.set(4, 11);
		t3  = t2.add(t1);
		t3.display();
		
		String actual = (t3.getFeet()+","+t3.getInches()).toString();
		assertEquals("13,1.0",actual);
	}

}
