package lt.baltictalents.testas.start;

public abstract class Zanras{
	public String pavadinimas;
	public int puslapiuSkaicius;
	
	public void setZanras(Type type, int puslapiuSkaicius) {
		this.pavadinimas = type.name();
		this.puslapiuSkaicius = puslapiuSkaicius;
	}
	
	public abstract Type getZanras();

	@Override
	public String toString() {
		return "Zanras [pavadinimas=" + pavadinimas + ", puslapiuSkaicius=" + puslapiuSkaicius + "]";
	}
	
}
