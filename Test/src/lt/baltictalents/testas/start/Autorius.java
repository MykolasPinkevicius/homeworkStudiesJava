package lt.baltictalents.testas.start;

public class Autorius{

	private String vardas;
	private String pavarde;
	private Leidykla leidykla;
	
	public Autorius(String vardas, String pavarde, Leidykla leidykla) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.leidykla = leidykla;
	}

	@Override
	public String toString() {
		return "Autorius [vardas=" + vardas + ", pavarde=" + pavarde + ", leidykla=" + leidykla + "]";
	}
	
	
	
}
