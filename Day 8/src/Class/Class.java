package Class;

public class Class {

	public static void main (String ... args) {
		
		try {
		ismesti();
		} catch(NumberFormatException e) {
			
		} catch(ManoPirmasisException ef) {
			System.out.println(ef);
		}
		
		
		
		try {
			Integer.parseInt("500");
//			int a = 5 / 0;
//			throw new IllegalArgumentException();
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.println("Nepavyko 5a0 paversti i skaiciu"); 
		} finally {
			System.out.println("Baigia darba");
		}
		Klase tavo = null;
		
		try(Klase mano = new Klase(50)) {
			tavo = mano;
			System.out.println(tavo.getA());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Baige darba " + tavo.getA());
		}
	}
	
	private static void ismesti() throws ManoPirmasisException {
		throw new ManoPirmasisException(ManoPirmasisException.METODAS_TUSCIAS, new IllegalArgumentException());
	}
	
}
