package datetime;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
class NewDate{
	Date date1;
	SimpleDateFormat formatter1;
	public boolean date(String s) {
	    formatter1=new SimpleDateFormat("dd/MM/yyyy");  
	    try {
		 date1=formatter1.parse(s);
		 return true;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("please enter date only in specified format");
			return false;
		}  
	    
	}
	public void addDate(int n) {
		Calendar c = Calendar.getInstance();
		c.setTime(date1);
		c.add(Calendar.DATE, n);
		String output = formatter1.format(c.getTime());
		System.out.println(output);
	}
}
public class FutureDate {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date in (dd/mm/yyyy) format:");
		String d = sc.nextLine();
		NewDate dt = new NewDate();
		
		if(dt.date(d)) {
			System.out.println("Enter number of days after which future date is to be found: ");
			int day = sc.nextInt();
			dt.addDate(day);	
		}
		else {
			System.out.println("date fromat was wrong");
		}
		
		
	}

}
