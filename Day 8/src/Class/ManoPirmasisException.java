package Class;

public class ManoPirmasisException extends Exception {
	
	public static final String METODAS_TUSCIAS = "Metode nera implementacijos";
	public static final String METODAS_PILNAS = "Metode nera implementacijos";
	public static final String METODAS_PUSTUSTIS = "Metode nera implementacijos";
	
	ManoPirmasisException( Throwable t) {
		
	}
	
	private String klaidosApr;
	
	ManoPirmasisException(String klaidosApr, Throwable t){
		this.klaidosApr = klaidosApr;
	}

	@Override
	public String toString() {
		return " " + klaidosApr + " ";
	}
	
	
	
}

