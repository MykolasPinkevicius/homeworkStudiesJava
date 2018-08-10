package mykolasPinke;

public class Mokinys extends Zmogus {

	
//	Mokinys[] masyvas = {
//			new Mokinys("Ieva"); // daugiau atskiriama kableliais
//	}
	
	public Mokinys(String vardas) {
		super(vardas);
	}
	
	public String klase;
	
	public int trimestras;
	
	public Mokinys(String vardas, String pavarde, String klase, int trimestras) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.klase = klase;
		this.trimestras = trimestras;
	}
	
//	
//	@Override
//	public String toString() {
////		return "Zmogus [vardas=" + vardas + ", pavarde=" + pavarde + "]";
//		return vardas + " " + pavarde + " " + age + " " + " " + klase;
//	}
	


	//	public Mokinys(String vardas, String pavarde, String klase) {
//		this.vardas = vardas;
//		this.pavarde = pavarde;
//		this.klase = klase;
//	}
	public Mokinys() {}

	@Override
	public String toString() {
		return "Mokinys [klase=" + klase + ", trimestras=" + trimestras + ", vardas=" + vardas + ", pavarde=" + pavarde
				+ ", age=" + age + "]";
	}
	
}
