package lambda;

import java.io.File;

public class SubDirectories {
	public static void main(String args[]) {
		File dir =  new File("D:\\capgemini_training");
		File[] subDirs = dir.listFiles((file)->{return file.isDirectory();});
		System.out.println("Name of sub directories ");
		for (File file : subDirs) {
			System.out.println(file.getName());
		}
	}
}
