package homework5;

import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Homework {

	public static void main(String[] args) {
		
		Zmogus zmogutis1 = new Zmogus("Vytautas", "Brazinskas", "38908090111");
		Zmogus zmogutis2 = new Zmogus("Povilas", "Prazinskas", "38908090112");
		Zmogus zmogutis3 = new Zmogus("Gediminas", "Drazinskas", "38908090115");
		Zmogus zmogutis4 = new Zmogus("Klementas", "Krazinskas", "38908090110");
		Zmogus zmogutis5 = new Zmogus("Kestutis", "Krazinskas", "38908090110");
		
//		System.out.println(zmogutis1);
//		System.out.println(zmogutis2);
		
		Map<String, Zmogus> values = new TreeMap<>();
		values.put("38908090111", zmogutis1);
		values.put("38908090112", zmogutis2);
		values.put("38908090115", zmogutis3);
		values.put("38908090110", zmogutis4);
		values.put("38908090110", zmogutis5);
			
		pridetiMapElementus(values);
		

		
		List<Zmogus> kintDebesis = new ArrayList<>();
		
		kintDebesis.add(new Zmogus("Vytautas", "Brazinskas", "38908090111"));
		kintDebesis.add(new Zmogus("Benas", "Nrazinskas", "38908090111"));
		kintDebesis.add(new Zmogus("Naglis", "Mrazinskas", "38908090111"));
		
		
		System.out.println(kintDebesis);
		
		
		
	}
		public static void pridetiMapElementus(Map<String, Zmogus> dynamiskasMasyvas) {
//			System.out.println(dynamiskasMasyvas.get("38908090111"));
			System.out.println(dynamiskasMasyvas);
			
			
		}
}
