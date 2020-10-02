 package FIleIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GrepApplication {
	public boolean grep(String location  , String search) throws IOException {
		File file = new File(location);
		int countLine=0 ;
		if(file.exists()) {
			BufferedReader reader = new BufferedReader(new FileReader(location));
			String line;
			while((line=reader.readLine())!=null) {
				countLine++;
				if(line.contains(search)) {
					System.out.println("String found at line number " + countLine + "\n " +line);
					return true;
				}
				
				}
			return false;
			
			}
			
		
		else {
			throw new IOException("File not found");
		}
	}
}
