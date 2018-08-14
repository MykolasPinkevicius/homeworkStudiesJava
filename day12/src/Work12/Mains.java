package Work12;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Mains {

	public static void main(String[] args) throws IOException {
		
		Stalas raudonasStalas = new Stalas("raudonas", 50);
		
		FileOutputStream output = new FileOutputStream(new File("Resources/stalas.ser"));
		output.write(raudonasStalas.toString().getBytes());
		
		output.close();
	}
	
	
}