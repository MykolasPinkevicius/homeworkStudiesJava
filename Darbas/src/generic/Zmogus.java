package generic;

public class Zmogus<T, E, F extends Number> extends Darbuotojas<T> {

	private T vardas;
	private E pavarde;
	private F age;
	
	public Zmogus(T vardas, E pavarde, F age) {
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.age = age;
	}
	
	public void printVardas() {
		System.out.println(vardas + " " + pavarde + " " + age);
	}
	
	public void printSkirtumas(F first, F second) {
		if (first instanceof Integer) {
			System.out.println(first.intValue() - second.intValue());
		} else {
			throw new IllegalArgumentException("Wow kazkas neto");
		}
	}
}
