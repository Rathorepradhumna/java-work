package FIleIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class MyClassMainOutput {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\MyClassList.txt"));  	  
		  ArrayList<MyClass> list = (ArrayList<MyClass>) in.readObject();
		  System.out.println("List of Students with their name and age");
		  for(MyClass m : list) {
			  System.out.println(m.getName()  + " " +  m.getAge());
		  }
		  
	}

}
