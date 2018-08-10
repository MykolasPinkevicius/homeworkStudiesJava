import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Write {

		public static void main (String ... args) throws Exception {
		
			
			
		
		
		}
}
//		readFile();
//		writeToFile();
//		
//	}
//	private static void writeToFile() throws FileNotFoundException, IOException {
//		File file = new File("resources/test2.txt");
//		
//		if (!file.exists()) {
//			file.createNewFile();
//			
//			try (OutputStream out = new FileOutputStream(file)) {
//				out.write(new byte[] {0X01, 0X02, 0X03});
//			}
//			
//			System.out.println("Writing to file done.");
//			}
//		}
		
		
//		private static void readTextFile() {
//			File file = new File("resources/test.txt");
//			
//			if (file.exists() && file.isFile()) {
//				System.out.println("This is a file: " + file.getName());
//				
//				try (FileReader reader = new FileReader(file)) {
//					reader.getEncoding();
//				} else {
//					throw new Exception("Not a file");
//				}
//			}
//		}
		
//		private static void writeToText() throws FileNotFoundException, IOException {
//			File file = new File("resources/test.txt");
//			
//			if (!file.exists()) {
//				file.createNewFile();
//				
//				try (FileWriter write = new FileWriter(file)) {
//					writer.write("aisuhdflaishud");
//				}
//				
//				System.out.println("Writing to file done.");
//				}
//			}
//}
	
		
//		File file = new File("resources/test.txt");
//		
//		if (file.exists() && file.isFile()) {
//			
//			System.out.println("This is a file: " + file.getName());
//			
//			try (InputStream  in = new FileInputStream(file)) {
//				char c = (char) in.read();
//				System.out.println(c);
//			}
//			
//		} else {
//			throw new Exception("Not a file");
//		}
//		
//		
//		
//	}
//	
//}