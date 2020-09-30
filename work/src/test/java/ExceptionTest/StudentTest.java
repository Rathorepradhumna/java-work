package ExceptionTest;

import static org.junit.Assert.*;

import org.junit.Test;

import BasicException.AgeNotWithinRangeException;
import BasicException.NameNotValidException;
import BasicException.Student;

public class StudentTest {

	@Test(expected = AgeNotWithinRangeException.class)
	public void testOne() throws AgeNotWithinRangeException , NameNotValidException {
		new Student(1,"pradhumna",55,"java");
	} 
	@Test(expected = NameNotValidException.class)
	public void testTwo() throws  NameNotValidException , AgeNotWithinRangeException{
		new Student(1,"pr@dhumn@",19,"java");
	}
	@Test
	public void testThree() throws  NameNotValidException , AgeNotWithinRangeException {
		Student test1 = new Student(3,"namrata",20,"c++");
		assertEquals("c++",test1.getCourse());
	}
}
