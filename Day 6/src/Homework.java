
public class Homework {
	
	public static void main(String[] args) {
		
	A.B noresimBTipo = new A().new B();
	
	noresimBTipo.atspausdinti();
	
	A.C noresimCTipo = new A.C();
	
	noresimCTipo.atspausdinti();
	
	atspausdintiSuma(new Nesukuriamas() {
		@Override
		public double suma(double a, double b) {
			return b + a;
		};
	}, 15, 99);
	
	}
	
	public static void atspausdintiSuma(Nesukuriamas abc, double a, double b) {
		System.out.println("Suma: " + abc.suma(a, b));
	}
	
}
	

