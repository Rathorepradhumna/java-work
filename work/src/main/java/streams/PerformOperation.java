package streams;

import java.util.function.Predicate;

public class PerformOperation {

	public static void performOperation(int num) {
		//odd number
		isOdd(num,p->p%2!=0);
		//prime number
		isPrime(num, p ->{
			int flag=0;
			for(int i=2;i<p/2;i++) {
				if(p%i==0) {
					flag=1;
				}
			}
			if(flag==0) {
				return true;
			}
			else {
				return false;
			}
		}
			
			);
		//palindrome number
		isPalindrome(num , n -> {
			int temp=n;
			int sum=0, r= 0;
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   return true;    
			  else    
			   return false;   
			}  
		);
	}
	private static void isOdd(int i,Predicate<Integer> p) {
		if(p.test(i)) {
			System.out.println("odd number");
		}
		else {
			System.out.println("even number");
		}
	}
	private static void isPrime(int i , Predicate<Integer> p) {
		if(p.test(i)) {
			System.out.println("is a prime number");
		}
		else {
			System.out.println("not a prime number");
		}
	}
	private static void isPalindrome(int i ,  Predicate<Integer> p ) {
		if(p.test(i)) {
			System.out.println("is a palindrome number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}
}
