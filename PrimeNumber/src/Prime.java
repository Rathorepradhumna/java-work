import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number :");
		Scanner sc = new Scanner(System.in);
		boolean check = sc.hasNextInt();
		if(check) {
			int number = sc.nextInt();
			boolean f = true;
			for(int i=2;i<number/2;i++) {
				if(number%i==0) {
					f = false;
					break;
				}
			}
			if(f==true) {
				System.out.println("prime number :"+number);
			}
			else {
				System.out.println("not a prime number :" + number);
			}

		}
		else {
			System.out.println("invalid input from user");
		}
		sc.close();
	}

}
