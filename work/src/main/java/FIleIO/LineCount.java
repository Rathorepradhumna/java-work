package FIleIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LineCount {
	
	public int countLines(String location) throws IOException  {
		File file  = new File(location);
		int count = 0;
		if(file.exists()) {
					BufferedReader reader = new BufferedReader(new FileReader(location));
					while(reader.readLine()!=null) {
						count++;
					}
					reader.close();
					return count;
					
		}	
		else {
			throw new FileNotFoundException("File not found");
		}
	}
}
