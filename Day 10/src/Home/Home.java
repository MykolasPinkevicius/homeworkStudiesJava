package Home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Home {

		public static void main (String[] args) {
	
			writeObjectToTextFile();
	

//	public static void main(String [] args){
//        StringBuilder sb = new StringBuilder();
//        String strLine = "";
//        List<String> list = new ArrayList<String>();
//        try {
//             BufferedReader br = new BufferedReader(new FileReader("Resources/tet.txt"));
//              while (strLine != null)
//               {
//                strLine = br.readLine();
//                sb.append(strLine);
//                sb.append(System.lineSeparator());
//                strLine = br.readLine();
//                if (strLine==null)
//                   break;
//                list.add(strLine);
//            }
//         System.out.println(Arrays.toString(list.toArray()));
//             br.close();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found");
//        } catch (IOException e) {
//            System.err.println("Unable to read the file.");
//        }
//     }
//}
	
	
	
	
//	public static void main (String ...args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		
////		writeObjectToTextFile();
//		readObjectFromTextFile();
//		
//	}
//	
//	
//	
//	private static void writeObjectToTextFile() throws FileNotFoundException, IOException {
//		
//		File file = new File("resources/mokiniai.txt");
//		
//		if (!file.exists()) {
//			file.createNewFile();
//			
//			try (ObjectOutputStream out = new ObjectOutputStream(
//					new FileOutputStream(file))) {
//				
//				out.writeObject(
//					Arrays.asList(
//							new Mokinys("Petriukas", "Kolinas"),
//							new Mokinys("Kipras", "Ziurkenas"),
//							new Mokinys("Karolis", "Zertvydas"),
//							new Mokinys("Klaudijus", "Bunegadegenis")
//							));
//					}
//				
//				System.out.println("Written");
//			}
//		}
		public static void writeObjectToTextFile() {
			try {
				ArrayList<Mokinys> yourObjectList;
				BufferedWriter write = new BufferedWriter(new FileWriter("Resources/mokiniai.txt"));
				for (Mokinys mok : yourObjectList) {
					writer.write(mok.toString());
				}
				} catch(Exception e){
		            throw new Exception("error");
	            }
				
				
		}
	}
		
}


//				
//		
//		public static void readObjectFromTextFile() throws ClassNotFoundException, IOException {
//			File file = new File("resources/mokiniai.txt");
//			
//			try (ObjectInputStream input = new ObjectInputStream(
//				new FileInputStream(file))) {
//				List<Mokinys> v = (List<Mokinys>) input.readObject();
//				
//				
//				System.out.print(v);
//			}
//			
//			System.out.println("Read");
//		}
//				
//				
//	}
//}
//	
//
