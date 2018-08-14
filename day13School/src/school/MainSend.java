package school;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.Gson;

/*
 * Reikia susikurti programa, kuri paimtus nustatymus is vartotojo klaviaturos
 * issiustu uzklausa i api postit ir gautu atsakyma koks pasto kodas
 * Turim susikurti klase uzklausa, kuri tures final string apikey
 * String miestas, string gatve, string numeris
 */

public class MainSend {

	public static void main(String... args) throws IOException {

		System.out.println("Please input City name");
		Scanner scan = new Scanner(System.in);
		String city = scan.nextLine();
		
		System.out.println("Please input Street name");
		String street = scan.nextLine();
		
		System.out.println("Please input number");
		String number = scan.nextLine();
		scan.close();

//		UzklausosSiuntimas siuntimas = new UzklausosSiuntimas("Vilnius", "Vilniaus", 2);
//		FileOutputStream output = new FileOutputStream(new File("Resources/adresas.txt"));
//		output.write(siuntimas.toString().getBytes());
//		output.close();

		URL address = new URL("https://postit.lt/data/v2/?city=" + city + "&street=" + street.replaceAll("\\s", "%20") + "&number=" + number + "&key=sZlFz93cslu0odzEZAtD");
		URLConnection conn = address.openConnection();
		InputStream in = conn.getInputStream();
		BufferedInputStream buff = new BufferedInputStream(in);
		String str = new String(buff.readAllBytes());
		buff.close();
		in.close();
		Gson jsonFormatter = new Gson();
		UzklausosAtsakymas answer = jsonFormatter.fromJson(str, UzklausosAtsakymas.class);
		System.out.println("Jūsų pašto kodas yra " + answer.getData()[0].getPost_code());
	}

}