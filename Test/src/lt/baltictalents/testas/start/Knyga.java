package lt.baltictalents.testas.start;

public class Knyga extends Zanras implements Tipas{
	
	private int metai;
	private Autorius autorius;
	private Zanras zanras;
	
	public int getMetai() {
		return metai;
	}

	public void ArYraElektronine() {};
	
	public void ArYraPopierine() {}

	public Knyga (int metai, String vardas, String pavarde, String adresas) {
		this.metai = metai;
		this.autorius = new Autorius(vardas, pavarde, new Leidykla(adresas));
	}

	@Override
	public Type getZanras() {
		return Type.valueOf(pavadinimas);
	}

	@Override
	public void setZanras(Type type, int puslapiuSkaicius) {
		super.setZanras(type, puslapiuSkaicius);
	}

	@Override
	public String toString() {
		return "Knyga [metai=" + metai + ", autorius=" + autorius + ", zanras=" + zanras;
	}
	
	
}
