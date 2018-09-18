package lamdaExpressions;

public class Zmogus implements Comparable<Zmogus> {
	
	private String name;
	private String surname;
	
	public Zmogus(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	@Override
	public int compareTo(Zmogus nextZmogus) {
		if (name.equalsIgnoreCase(nextZmogus.name)) {
			return surname.compareToIgnoreCase(nextZmogus.surname);
		}
		
		return name.compareToIgnoreCase(nextZmogus.name);
	}

	@Override
	public String toString() {
		return "Zmogus [name=" + name + ", surname=" + surname + "]";
	}

}
