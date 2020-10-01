package FileTest;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import FIleIO.LineCount;

public class LineCountTest {

	@Test
	public void testOne() throws IOException {
		LineCount test1 = new LineCount();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		assertEquals(1,test1.countLines(location));
	}
	@Test(expected = IOException.class)
	public void testTwo() throws IOException {
		LineCount test1 = new LineCount();
		String location = "D:\\capgeminitraining\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		test1.countLines(location);
	}


}
