package CommandLine;

import objectManupulation.Rectangle;

public class CommandLineMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int sum  = a+b+c;
		System.out.println("Sum of command line argument values : " +sum);
		
	}
}
