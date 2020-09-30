package FIleIO;

import java.io.File;
import java.io.IOException;

public class FIleExist {
	public boolean fileExist(String location) throws IOException {
		File file  = new File(location);
		if(file.exists()) {
			return true;
		}
		throw new IOException("File not found");
	}
}
