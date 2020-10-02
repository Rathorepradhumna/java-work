package FIleIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainOne {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(100,"Pradhumna",400000);
		Employee emp2 = new Employee(100,"Namrata",330000);
		Employee emp3 = new Employee(100,"Poorva",2500000);
		FileOutputStream fout = new FileOutputStream("D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\SerializationDeserialization.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);  
		out.writeObject(emp1);
		out.writeObject(emp2);
		out.writeObject(emp3);
		out.flush();
		out.close();
	}

}
