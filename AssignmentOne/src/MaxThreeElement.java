
public class MaxThreeElement {

	public int[] sortArray(int arr[],int n) {
		for(int i=0;i<10;i++) {
			for(int j=0 ; j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public int maxOne(int arr[],int n) {
		return arr[n-1];
	}
	public int maxTwo(int arr[],int n) {
		return arr[n-2];
	}
	public int maxThree(int arr[],int n) {
		return arr[n-3];
	}
}
