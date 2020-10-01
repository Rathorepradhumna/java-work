package datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class AliveDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LocalDate startDate = LocalDate.parse("1998-08-26"); 
		  LocalDate today = LocalDate.now();  
		  Period period = Period.between(startDate, today); 
		  System.out.print(period.getYears()*365+period.getMonths()*30);
	}

}
