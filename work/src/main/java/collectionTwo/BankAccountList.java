package collectionTwo;
import java.util.Comparator;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class BankAccountList {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		SavingAccount s1 = new SavingAccount(1000,1,"Pradhumna Rathore",false);
		SavingAccount s2 = new SavingAccount(2000,4,"Namrata Soni",true);
		SavingAccount s3 = new SavingAccount(3000,6,"Poorva Paliwal",true);
		SavingAccount s4 = new SavingAccount(4000,3,"Muskan Bagdi",false);
		SavingAccount s5 = new SavingAccount(5000,9,"Hardik Gupta",false);
		ArrayList<SavingAccount> list = new ArrayList<SavingAccount>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//display using simple for loop
		System.out.println("Print using simple for loop");
		for(SavingAccount s : list) {
			System.out.println(s);
		}
		
		
		//display from file
		System.out.println("Display using file");
		FileOutputStream fout = new FileOutputStream("D:\\capgemini_training\\java\\work\\src\\main\\java\\collectionTwo\\accounts.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);  
		out.writeObject(list);
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\\\capgemini_training\\\\java\\\\work\\\\src\\\\main\\\\java\\\\collectionTwo\\\\accounts.txt"));  	  
	  ArrayList<SavingAccount> listDisp = (ArrayList<SavingAccount>) in.readObject();
	  listDisp.stream().forEach(i->System.out.println(i));
	 
	  
	  //display in sorted order as per acc_id
	  Collections.sort(listDisp, (l1,l2)->Integer.toString(l1.getAcc_Id()).compareTo(Integer.toString(l2.getAcc_Id())));
	  System.out.println("Display sorted by accID");
	  listDisp.forEach(l->System.out.println(l));
	}
}
