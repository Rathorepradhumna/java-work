package FIleIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class WordCount {
	public int wordCount(String location) throws IOException {
		int count=0;
		String line;
		File file = new File(location);
		if(file.exists()) {
			BufferedReader reader = new BufferedReader(new FileReader(location));
			while((line=reader.readLine())!=null) {
			
				//line  = reader.readLine();
				String wordList[] = line.split(" ");
				System.out.println(Arrays.toString(wordList));
				count +=wordList.length;
			}
			reader.close();
			return count;
		}
		else {
			throw new IOException("file not found");
		}
	}
}
