package FIleIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MyClassMain {
	public static void main(String args[]) throws IOException {
		ArrayList<MyClass> list = new ArrayList<MyClass>();
		MyClass c1 = new MyClass("pradhumna",22);
		MyClass c2 = new MyClass("namrata",22);
		MyClass c3 = new MyClass("poorva",23);
		MyClass c4 = new MyClass("hardik",22);
		MyClass c5 = new MyClass("punit",21);
		MyClass c6 = c2;
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		FileOutputStream fout = new FileOutputStream("D:\\capgemini_training\\java\\work\\src\\main\\java\\FIleIO\\myClassList.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);  
		out.writeObject(list);
	}
}
