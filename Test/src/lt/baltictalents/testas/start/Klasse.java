package lt.baltictalents.testas.start;

public class Klasse {

	public static void main(String[]args) {
		System.out.println("Kvietimas is main metodo, klases (sugalvotos klases pavadinimas) ");
		// arba jeigu reikia tik atspauzdinti sugalvotos klases pavadinima
		System.out.println("Klasse");
		
		Knyga book = new Knyga(1977, "Kinkiduk", "Vrobkiduk", "Petriuko g. 30");
		book.setZanras(Type.ACTION, 300);
		System.out.println(book);
		System.out.println(book.getZanras());
	}
}
