package collectionTwo;

public class Employee_Information {
   private int empId;
   private String empName;
   private String empDesignation;
   private int empSalary;
public Employee_Information(int empId, String empName, String empDesignation, int empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empDesignation = empDesignation;
	this.empSalary = empSalary;
}
public int getEmpId() {
	return empId;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee_Information other = (Employee_Information) obj;
	if (empId != other.empId)
		return false;
	return true;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpDesignation() {
	return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
   
}
