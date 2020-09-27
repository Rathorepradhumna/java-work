package employee;

public class Employee {
	private int id;
	private String name;
	private int monthlyBasic;

	public Employee(int id, String name, int monthlyBasic) {
		super();
		this.id = id;
		this.name = name;
		this.monthlyBasic = monthlyBasic;
	}
	public int getAnnualBasic() {
		return 12*this.monthlyBasic;
	}
	public double getMonthlyGrossSalary() {
		return (monthlyBasic + (0.5*this.monthlyBasic) + 1250 + 800);
	}
	public double getAnnualGrossSalary() {
		return (12*this.getMonthlyGrossSalary());
	}
	public double getMonthlyDeductions() {
		double pf = 6500;
		if((0.1*this.monthlyBasic)<6500) {
			pf = (0.1*this.monthlyBasic);
		}
		double esic = 0;
		if(this.monthlyBasic<=5000) {
			esic = (4.75*this.monthlyBasic)/100;
		}
		int profTax = this.monthlyBasic<=10000?50:100;
		return (pf + esic + profTax);
	}
	public double getMonthlyTakeHome()
	{	
		return (this.getMonthlyGrossSalary()-this.getMonthlyDeductions());
	}
	public double getAnnualTakeHome() {
		return 12*this.getMonthlyTakeHome();
	}
	
	
	public static void main(String args[]) {

		Employee emp1= new Employee(101,"Pradhumna Rathore",30000);
		
		System.out.println("Id: "+emp1.name);
		System.out.println("Name: "+emp1.id);
		System.out.println("Monthly Basic: "+emp1.monthlyBasic);
		System.out.println("Annual Basic: "+emp1.getAnnualBasic());
		System.out.println("Monthly Gross Salary:"+emp1.getMonthlyGrossSalary());
		System.out.println("Annual Gross Salary:"+emp1.getAnnualGrossSalary());
		System.out.println("Monthly Deductions: "+emp1.getMonthlyDeductions());
		System.out.println("Monthly Takehome: "+emp1.getMonthlyTakeHome());
		System.out.println("Annual Takehome: "+emp1.getAnnualTakeHome());
	}

}
