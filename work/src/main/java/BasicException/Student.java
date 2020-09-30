package BasicException;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String course;
	public Student(int rollNo, String name, int age, String course) throws NameNotValidException , AgeNotWithinRangeException{
		super();
		if(age>=15&&age<=21) {
			this.rollNo = rollNo;
		}
		else {
			throw new AgeNotWithinRangeException("Age is not in defined range");
		}
		int flag=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if((ch<'A'||ch>'Z')  && (ch<'a'||ch>'z')) {
				flag =1;
			}
		}
		if(flag==0) {
			this.name = name;
		}
		else {
			throw new NameNotValidException("please enter a valid name");
		}
		
		this.age = age;
		this.course = course;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
