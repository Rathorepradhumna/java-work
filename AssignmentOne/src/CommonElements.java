import java.util.*;
public class CommonElements {
	public static ArrayList<Integer> common(int arr1[], int arr2[],int arr3[]) {
		ArrayList<Integer> common = new ArrayList<Integer>();
		int i=0 , j= 0 , k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length) {
			if(arr1[i]==arr2[j]&&arr2[j]==arr3[k]) {
				int x = arr1[i];
				common.add(x);
				i++;
				j++;
				k++;
				
			}
			else if(arr1[i]<arr2[j]) {
				i++;
			}
			else if(arr2[j]<arr3[k]) {
				j++;
			}
			else {
				k++;
			}
		}
		return common;
	}
	 public static void main(String args[]) {

	        int ar1[] = {1, 5, 10, 20, 40, 80}; 
	        int ar2[] = {6, 7, 20, 80, 100}; 
	        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}; 
	        ArrayList<Integer> arr  = common(ar1,ar2,ar3);
	        for(int i = 0; i < arr.size(); i++) {   
	            System.out.print(" "+arr.get(i));
	        }  
	 }
}
