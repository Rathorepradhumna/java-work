package FileTest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import FIleIO.FIleExist;

public class FileExistTest {

	@Test
	public void testOne() throws IOException{
		FIleExist test1 = new FIleExist();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\Hello.txt";
		assertEquals(true,test1.fileExist(location));
	}
	@Test(expected =  IOException.class)
	public void testTwo() throws IOException{
		FIleExist test1 = new FIleExist();
		String location = "D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\He.txt";
		test1.fileExist(location);
	}

}
