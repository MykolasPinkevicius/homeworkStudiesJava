package lt.baltictalents;

public class Kurmis {

	String infoApieKurmi;
	String name;
	int age;
	boolean home;
	
	public Kurmis (String infoApieKurmi) {
		this.infoApieKurmi = infoApieKurmi;
	}
	
	public String getInfoApieKurmi() {
		return infoApieKurmi;
	}
	public void setInfoApieKurmi(String infoApieKurmi) {
		this.infoApieKurmi = infoApieKurmi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isHome() {
		return home;
	}
	public void setHome(boolean home) {
		this.home = home;
	}
	@Override 
	public String toString() {
		return (infoApieKurmi);
	}
	
	
	
}
