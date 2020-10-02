package FileTest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import FIleIO.GrepApplication;

public class GrepTest {

	@Test
	public void testOne() throws IOException {
		GrepApplication test1 = new GrepApplication();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		String search = "pradhumna";
		assertEquals(true,test1.grep(location, search));
	}
	@Test
	public void testTwo() throws IOException {
		GrepApplication test2 = new GrepApplication();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		String search = "rathore";
		assertEquals(false,test2.grep(location, search));
	}

}
