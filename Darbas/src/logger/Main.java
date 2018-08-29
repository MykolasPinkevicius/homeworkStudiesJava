package logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {

	
	static {
 	try ( InputStream fs = new FileInputStream(new File("Resources/logging.properties"))){
 		LogManager.getLogManager().readConfiguration(fs);
 	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 	
	}
	private static Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main(String[]args) {
		
		System.out.println("Vardas");
		System.err.println("Vardas");
		try {
			throw new IllegalArgumentException();
		} catch(IllegalArgumentException e) {
		log.log(Level.INFO,"Vardas", new IllegalArgumentException());
		 throw e;
		}
		
	}
	
}
