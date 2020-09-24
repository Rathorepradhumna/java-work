import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
public class TestMax {

	@Test
	public void test() {
		MaxThreeElement test = new MaxThreeElement();
		//int arr[] = {5,6,7,3,2,1,9,8,10,0};
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++) {
			arr[i]= sc.nextInt();
		}
		int[] newArr = test.sortArray(arr, 10);
		int m1 = test.maxOne(newArr, 10);
		assertEquals(newArr[9],m1);
		int m2 = test.maxTwo(newArr, 10);
		assertEquals(newArr[8],m2);
		int m3 = test.maxThree(newArr, 10);
		assertEquals(newArr[7],m3);
	}

}
