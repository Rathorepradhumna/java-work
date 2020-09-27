package BasicException;
import java.util.InputMismatchException;
public class Factorial {
	public static int getFactorial(int num) throws InvalidInputException  {
		int fact=1;
		if(num<2) {
			throw new InvalidInputException("number cannot be less than 2");
		}
		else {
			
			for(int i=num;i>=2;i++) {
				fact=fact*i;
			}
		}
		
		return fact;
	}
	
	public static void main(String args[]) {
		try {
			int res = getFactorial(5);
		}
		catch(InvalidInputException e) {
			
		}
	}
}
