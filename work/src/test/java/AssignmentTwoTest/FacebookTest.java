package AssignmentTwoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import AssignmentTwo.FacebookLikes;

public class FacebookTest {

	@Test
	public void testOne() {
		FacebookLikes test  = new FacebookLikes();
		String arr[] = {};
		String expected = "no one likes this"; 
		String res = test.likes(arr);
		assertEquals(expected,res);
	}
	@Test
	public void testTwo() {
		FacebookLikes test  = new FacebookLikes();
		String arr[] = {"Peter"};
		String expected = "Peter likes this"; 
		String res = test.likes(arr);
		assertEquals(expected,res);
	}
	@Test
	public void testThree() {
		FacebookLikes test  = new FacebookLikes();
		String arr[] = {"Jacob", "Alex"};
		String expected = "Jacob and Alex like this"; 
		String res = test.likes(arr);
		assertEquals(expected,res);
	}
	@Test
	public void testFour() {
		FacebookLikes test  = new FacebookLikes();
		String arr[] = {"Max", "John", "Mark"};
		String expected = "Max, John and Mark like this"; 
		String res = test.likes(arr);
		assertEquals(expected,res);
	}
	@Test
	public void testFive() {
		FacebookLikes test  = new FacebookLikes();
		String arr[] =  {"Alex", "Jacob", "Mark", "Max"};
		String expected = "Alex, Jacob and 2 others like this"; 
		String res = test.likes(arr);
		assertEquals(expected,res);
	}
}
