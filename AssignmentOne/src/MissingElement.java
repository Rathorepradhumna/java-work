import java.util.Scanner;
public class MissingElement {
	public static int missing(int arr[]) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		int n = arr.length +1;
		int sumExpected = n*(n+1)/2;
		int result = sumExpected - sum;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		System.out.println("enter elements in array :");
		int arr[] =  new int[n];
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		int missingValue = missing(arr);
		System.out.println("missing value was :"+ missingValue);
	}

}
