package person;
import java.time.*;
import java.time.format.DateTimeFormatter; 

public class Person {
	private String name; // data member to store the name of a person.
	private LocalDate dob; // data member to store the date of birth of a person.
	@SuppressWarnings("deprecation")
	public Person(String n, int d, int m, int y) //constructor to initialize Person objects
	{
		//initialize the data members of the current Person object using the parameters. 
		this.name = n;
		dob = LocalDate.of(y, m, d);
	}
	public String getDob() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY"); 
		return formatter.format(dob);
	}
	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Date : "  + this.getDob());
		System.out.println("Age  :" + this.getAge());
	}
	public String getAge() {
		Period period = Period.between(this.dob, LocalDate.now());
		return period.getYears() + " years " + period.getMonths() + " Months " + period.getDays() + " days";
		
	}
	public String olderPerson(Person p) {
		if(this.dob.isBefore(p.dob)) {
			Period period = Period.between(this.dob, p.dob);
			return this.name + " is older than " + p.name + " by " + period.getYears() + " years " + period.getMonths()
			+ " months " + period.getDays() + " days";
		}
		else {
			Period period = Period.between(p.dob, this.dob);
			return p.name + " is older than " + this.name + " by " + period.getYears() + " years " + period.getMonths()
			+ " months " + period.getDays() + " days";
		}
	}
	
	
}
