
public class Day {
	public static void main (String ... args) {
	
		AutoMarke.values();
		for (AutoMarke marke: AutoMarke.values()) {
			System.out.println(marke);
		}
	}
	
	public enum AutoMarke {
		BMW, AUDI, SKODA, MERCEDESBENZ
	}
}
