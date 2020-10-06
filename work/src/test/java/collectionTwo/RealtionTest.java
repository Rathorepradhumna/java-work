package collectionTwo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RealtionTest {
	Relation rel = new Relation();
	Employee_Information emp1 = new Employee_Information(1,"Pradhumna Rathore" , "CEO" , 100000);
	Employee_Information emp2 = new Employee_Information(2,"Namrata Soni" , "VP" , 80000);
	Employee_Information emp3 = new Employee_Information(3,"Poorva Paliwal" , "HR" , 50000);
	Employee_Information emp4 = new Employee_Information(4,"Muskan Bagdi" , "Manager" , 60000);
	Employee_Information emp5 = new Employee_Information(5,"Hardik Gupta" , "Head" , 70000);
	
	MMASaving m1  = new MMASaving(100,"Pradhumna Rathore" , 10000 , true);
	MMASaving m2  = new MMASaving(101,"Namrata Soni" , 5000 , true);
	MMASaving m3  = new MMASaving(102,"Poorva Paliwal" , 4000 , true);
	MMASaving m4  = new MMASaving(103,"Muskan Bagdi" , 2000 , false);
	MMASaving m5  = new MMASaving(104,"Hardik Gupta" , 80000 , true);
	
	@Before
	public void addInRel() {
		rel.add(emp1, m1);
		rel.add(emp2, m2);
		rel.add(emp3, m3);
		rel.add(emp4, m4);
		rel.add(emp5, m5);
		
	}
	
	
	
	@Test
	public void test() {
		rel.display();
		assertEquals(5,rel.getSize());
	}

}
