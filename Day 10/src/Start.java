import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Start {

	public static void main (String ... args) throws Exception {
		
		File file = new File("resources/test.txt");
		
		if (file.exists() && file.isFile()) {
			
			System.out.println("This is a file: " + file.getName());
			
			try (InputStream  in = new FileInputStream(file)) {
				char c = (char) in.read();
				System.out.println(c);
			}
			
		} else {
			throw new Exception("Not a file");
		}
		
		
		
	}
	
}
