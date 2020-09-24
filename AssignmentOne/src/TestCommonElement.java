 import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class TestCommonElement {

	@Test
	public void testOne() {
		CommonElements test1  =new CommonElements();
		 int ar1[] = {1, 5, 10, 20, 40, 80}; 
	     int ar2[] = {6, 7, 20, 80, 100}; 
	     int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
	     ArrayList<Integer> res = test1.common(ar1, ar2, ar3);
	     int[] ret = new int[res.size()];
	     for (int i=0; i < ret.length; i++)
	     {
	         ret[i] = res.get(i).intValue();
	     }
	     int expected[] = {20,80};
	     assertArrayEquals(expected,ret);
	}

}
