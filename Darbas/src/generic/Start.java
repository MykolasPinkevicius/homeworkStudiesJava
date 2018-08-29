package generic;

public class Start {

public static void main(String[]args) {
		
		Zmogus<String, String, Integer> naujas = new Zmogus<>("Vardenis", "Pavardenis", 40);
		naujas.printVardas();
		
//		Zmogus<String, String, Integer> naujas2 = new Zmogus<>("Vladukas","Pirdziukas", 50);
//		naujas2.printVardas();
//		
		naujas.printSkirtumas(5, 4);
		
//		NaujasNeparametrizuota nauja = new NaujasNeparamentrizuota();
//		nauja.
		
	}
}
