
public class SecondException extends Exception {
	
	public static final String METHOD_EMPTY= "Err 4919";
	
	SecondException () {}
	
	SecondException ( Throwable th) {
		System.out.println("Throwinu");
	}
	
	private String error;
	
	SecondException(String error, Throwable th) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "Ups It's something wrong " + error + " ";
	}
	
	public static void toDevide(Integer a, Integer b) throws SecondException {
		double resultB;
		if(a == null) {
			throw new SecondException(SecondException.METHOD_EMPTY, new IllegalArgumentException());
		}
		if(b == null) {
			throw new SecondException(SecondException.METHOD_EMPTY, new IllegalArgumentException());
		} else {
			resultB = a / b;
			System.out.println(resultB);
		}
	}
//	private static void toThrow() throws SecondException {
//		throw new SecondException(SecondException.METHOD_EMPTY, new IllegalArgumentException());	
//	}
	

}
