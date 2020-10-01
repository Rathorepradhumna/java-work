package FileTest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import FIleIO.WordCount;

public class WordCountTest {

	@Test
	public void testOne() throws IOException {
		WordCount test1 = new WordCount();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		assertEquals(13,test1.wordCount(location));
	}
	@Test(expected = IOException.class)
	public void testTwo() throws IOException {
		WordCount test1 = new WordCount();
		String location = "D:\\capgeminitrainig\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		//assertEquals(14,test1.wordCount(location));
		test1.wordCount(location);
	}

}
