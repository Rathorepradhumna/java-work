package lambda;

import java.io.File;

public class WithGivenExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir =  new File("D:\\capgemini_training");
		File[] subDirs = dir.listFiles((d, name) -> name.toLowerCase().endsWith(".txt"));
		for(File s : subDirs) {
			System.out.println(s.getName());
		}
	}

}
