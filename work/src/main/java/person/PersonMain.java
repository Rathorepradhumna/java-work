package person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Pradhumna", 26, 8, 1998);
		Person p2 = new Person("Namrata", 8, 6, 1998);
		p1.display();
		p2.display();
		String res= p2.olderPerson(p1);
		System.out.println(res);
	}

}
