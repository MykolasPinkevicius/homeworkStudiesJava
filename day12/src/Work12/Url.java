package Work12;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import com.google.gson.Gson;

public class Url {

	public static void main (String[] args) throws IOException{
		
		URL address = new URL("https://postit.lt/data/v2/?city=Palanga&street=Basanavi%C4%8Dius&number=2&key=postit.lt-examplekey");
		
		URLConnection conn = address.openConnection();
	
		InputStream in = conn.getInputStream();
		BufferedInputStream buff = new BufferedInputStream(in);
		
		String str = new String(buff.readAllBytes());
		
//		Gson jsonFormatter = new Gson();
//		String jSonned = jsonFormatter.toJson(new Stalas("Baltas", 1000));
////		System.out.println(jSonned)
		
		
		buff.close();
		in.close();
		
		Gson jsonFormatter = new Gson();
		PostitAnswer answer = jsonFormatter.fromJson(str, PostitAnswer.class);
				
				System.out.println("***** " + answer.getData()[0].getPost_code());
				
//				System.out.println(jsonFormatter.toJson(answer));
	}
}
