package mykolasPinke;

public class Zmogus {
	
	public String vardas;
	
	public String pavarde;
	
	public int age;
	
	public Zmogus(String vardas, String pavarde) {
		this.vardas = vardas;
		this.pavarde = pavarde;
	}
	
	public Zmogus(String vardas) {
		this.vardas = vardas;
	}

	@Override
	public String toString() {
//		return "Zmogus [vardas=" + vardas + ", pavarde=" + pavarde + "]";
		return vardas + " " + pavarde + " " + age + " ";
	}
	
	public Zmogus() {}
}
