import java.util.Arrays;

public class ZerosToEnd {
	public static int[] move(int arr[]) {
		int count=0;
		System.out.println("inside move");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) { 
				arr[count] = arr[i];
				
				count++;
			}
		}
		for(int j=count;j<arr.length;j++) {
				arr[count++] = 0;
			}
		return arr;
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,4,5,0,0,7};
		int resultArray[] = move(arr);
		System.out.println("Output Array : "+ Arrays.toString(resultArray));
		
	}
}
