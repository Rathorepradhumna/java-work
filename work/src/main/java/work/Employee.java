package work;

public class Employee {
	private int id;
	private String name;
	private int monthlyBasic;
	private int medical = 1250;
	private int conveyance = 800;
	private double hra = 0.5*this.monthlyBasic;
	private double esic = this.monthlyBasic<=5000?(4.75*(this.monthlyBasic)):0;
	private int profTax = this.getMonthlyGrossSalary()<=10000?50:100;
	Employee(int id, String name ,int monthlyBasic){
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	public int getAnnualBasic() {
		return 12*this.monthlyBasic;
	}
	public double getMonthlyGrossSalary() {
		return this.monthlyBasic + this.hra + this.medical + this.conveyance;
	}
	public double getAnnualGrossSalary(double monthlyGrossSalary) {
		return 12*monthlyGrossSalary;
	}
	
	
	


}
