package lambda;

import java.io.File;

public class WithGivenExtension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir =  new File("D:\\capgemini_training");
		String[] subDirs = dir.list((d, name) -> d.isDirectory() && name.toLowerCase().endsWith(".txt"));
		for(String s : subDirs) {
			System.out.println(s);
		}
	}

}
