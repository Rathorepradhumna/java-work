package FIleIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainTwo {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\SerializationDeserialization.txt"));  	  
		  Employee e = (Employee) in.readObject();
		  System.out.print(e.getName() + e.getId() + e.getSalary());
		 
		  in.close();
	}
}
