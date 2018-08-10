
public class Mokinys implements Comparable<Mokinys> {

	private String vardas;
	private String pavarde;
	private int age;
	
	public Mokinys(String vardas, int age) {
		this.vardas = vardas;
		this.age = age;
	}
	
	public String getVardas() {
		return vardas;
		
	}
	public void setVardas(String vardas) {
		this.vardas = vardas;
	}
	public String getPavarde() {
		return pavarde;
	}
	public void setPavarde(String pavarde) {
		this.pavarde = pavarde;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mokinys [vardas=" + vardas + ", age=" + age + "]";
	}
	public int compareTo(Mokinys antras) {
		if (getVardas().compareToIgnoreCase(antras.getVardas()) == 0) {
			if (getAge() == antras.getAge()) {
				return 0;
			} else if (getAge() > antras.getAge()) {
				return -1;
			} else {
				return 1;
			}
			} else if (getVardas().compareToIgnoreCase(antras.getVardas()) > 0) {
			return 1;
			} else {
			return -1;
			}
		}
		
}
