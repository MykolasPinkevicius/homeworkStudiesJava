
public class Home {

	public static void main (String ... args ) throws SecondException {
		
		
		try {
			toThrow();
			} catch (SecondException ex) {
				System.out.println(ex);
			}
		
		SecondException.toDevide(7, 7);
		
	}
		
	
	private static void toThrow() throws SecondException {
		throw new SecondException(SecondException.METHOD_EMPTY, new IllegalArgumentException());	
	}
	
	
}

