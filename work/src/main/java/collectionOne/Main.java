package collectionOne;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		Laptop l1 = new Laptop("Dell","xps","windows","core i7");
		Laptop l2 = new Laptop("Dell","inspiron","windows","core i7");
		Laptop l3 = new Laptop("Asus","vivobook","windows","core i3");
		GeneralSet <Laptop> laptops = new GeneralSet<Laptop>();
		laptops.addObjects(l1);
		laptops.addObjects(l2);
		laptops.addObjects(l3);
		Set <Laptop> lapi= laptops.getObjects();
		for(Laptop i : lapi) {
			System.out.println(i.getModel()+" " + i.getCompany());
		}
		School s1 = new School("CPS","indore","indore",10);
		School s2 = new School("DPS","rau","indore",1);
		School s3 = new School("APS","indore","indore",5);
		School s4 = new School("Emreald heights","indore","indore",2);
		School s5 = new School("Chohitram","indore","indore",3);
		School s6 = new School("NDPS","indore","indore",7);
		GeneralList<School> schools = new GeneralList<School>();
		schools.addObjects(s1);
		schools.addObjects(s2);
		schools.addObjects(s3);
		schools.addObjects(s4);
		schools.addObjects(s5);
		schools.addObjects(s6);
		List<School> sch = schools.getObject();
		System.out.println("Names of school by list");
		for(School i:sch) {
			System.out.print(i.getName()+ " ");
		}
		GeneralTreeSet<School> schoolsGenTree = new GeneralTreeSet<School>();
		schoolsGenTree.addObject(s1);
		schoolsGenTree.addObject(s2);
		schoolsGenTree.addObject(s3);
		schoolsGenTree.addObject(s4);
		schoolsGenTree.addObject(s5);
		schoolsGenTree.addObject(s6);
		TreeSet<School> sch2 = schoolsGenTree.getObject();
		System.out.println("Names of school by order");
		for(School i: sch2) {
			System.out.print(i.getName()+ " ");
		}
		
	}
}
