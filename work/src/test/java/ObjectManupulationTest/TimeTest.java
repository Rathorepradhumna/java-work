package ObjectManupulationTest;

import static org.junit.Assert.*;

import org.junit.Test;

import objectManupulation.Time;

public class TimeTest {

	@Test
	public void testOne() {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.setTime(2, 30);
		t2.setTime(4, 15);
		t3 = t2.sum(t1);
		//t3.showTime();
		String res = t3.getHours() + " : " + t3.getMinute();
		assertEquals("6 : 45",res);
	}
	@Test
	public void testTwo() {
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		t1.setTime(6, 55);
		t2.setTime(5, 25);
		t3 = t2.sum(t1);
	//	t3.showTime();
		String res = t3.getHours() + " : " + t3.getMinute();
		assertEquals("12 : 20",res);
	}

}
