package mykolasPinke;

import java.util.Arrays;

public class dienaAntra {
	public static void main(String[] args) {
		
//		Zmogus[] array = {
//				new Zmogus("Ieva", "Pievaite"),
//				new Zmogus("Robinas", "Hoodas"),
//				new Zmogus("Donaldas", "Dukas"),
//		};
		
		Zmogus[] array = { 
				new Zmogus("Ieva", "Pieva"), 
				new Zmogus("Pieva", "Ieva"), 
				new Zmogus("Darius", "Darynskas") 
				};
		
		System.out.println(Arrays.toString(array));
		
		Zmogus zmogus1 = new Zmogus("Gediminas","Kazlaitis");		
		zmogus1.vardas = "Gediminas";
		zmogus1.pavarde = "Kazlaitis";
		zmogus1.age = 40;
		
		Zmogus zmogus2 = new Zmogus("Morta","Kazlaitiene");
		zmogus2.vardas = "Morta";
		zmogus2.pavarde = "Kazlaitiene";
		zmogus2.age = 37;
		
		Zmogus zmogus3 = new Zmogus("Tikvardis");
		zmogus3.pavarde = "Kazlaitis";
		zmogus3.age = 30;
		
		Mokinys mokinys1 = new Mokinys("Antanas", "Kazlaitis" , "Pirmoji", 1);
		mokinys1.vardas = "Antanas";
		mokinys1.pavarde = "Kazlaitis";
		mokinys1.klase = "Pirma";
		mokinys1.trimestras = 7;
		mokinys1.age = 1;
		
		System.out.println(zmogus1);
		System.out.println(zmogus3);
		System.out.println(mokinys1);
		
		int suma = 100, i = 0;
		while (i < suma) {
			i++;
			System.out.println(i);
		}
	}

}
