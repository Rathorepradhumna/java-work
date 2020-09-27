package AssignmentThreeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmnetThree.SquareNumber;

public class SquareNumberTest {

	@Test
	public void testOne() {
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(-1);
		assertEquals(false,actual);
	}
	@Test
	public void testTwo() {
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(25);
		assertEquals(true,actual);
	}
	@Test
	public void testThree() {
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(26);
		assertEquals("25 is a perfect square",false,actual);
	}
	@Test
	public void testFour() {W
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(3);
		assertEquals("3 is not a perfect square",false,actual);
	}
	@Test
	public void testFive() {
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(4);
		assertEquals("4 is a perfect square",true,actual);
	}
	public void testSix() {
		SquareNumber test = new SquareNumber();
		boolean actual = test.isSquare(0);
		assertEquals(,true,actual);
	}
}
