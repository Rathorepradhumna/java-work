package BasicException;
public class Factorial {
	public static int getFactorial(int num) throws InvalidInputException , FactorialException  {
		int fact=1;
		if(num<2) {
			throw new InvalidInputException("number cannot be less than 2");
		}
		else {
			
			for(int i=num;i>=2;i--) {
				if(fact==Integer.MAX_VALUE) {
					throw new FactorialException("Factoial exceding range of integer");
				}
				fact=fact*i;
				
			}
		}
		
		return fact;
	}
	
	public static void main(String args[]) {
		System.out.println(Integer.MAX_VALUE);
		try {
			int res = getFactorial(20);
			System.out.println("Factorial is : " + res);
		}
		catch(InvalidInputException e) {
			System.out.println(e.getMessage());
		}
		catch(FactorialException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
