package AssignmentThreeTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmnetThree.SpinWords;

public class SpinWordsTest {

	@Test
	public void testOne() {
		SpinWords test = new SpinWords();
		String actual = test.spinWordsMethod("This is a test");
	
		String expected = "This is a test"; 
		assertEquals( expected,actual);
	}
	@Test
	public void testTwo() {
		SpinWords test = new SpinWords();
		String actual = test.spinWordsMethod("Hey fellow warriors");
		
		String expected = "Hey wollef sroirraw"; 
		assertEquals( expected,actual);
	}
	@Test
	public void testThree() {
		SpinWords test = new SpinWords();
		String actual = test.spinWordsMethod("This is another test");
		
		String expected = "This is rehtona test"; 
		assertEquals( expected,actual);
	}



}
