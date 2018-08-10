package goodPracticesObjectsAndClasses;

public class Figura implements figurosVeiksmai{

	public double apskaiciuotiPlota(double a, double b) {
		System.out.println("Turetu buti plotas "+ a + " " + b);
		return a;
	}	
	
	public String forma;
	
	public Figura(String forma) {
		
		this.forma = forma;
	}
	
}
