

public class Intheschool {

	public static void main (String ... args) {
		
		// iesko ar yra tokiu konstantu.
		AutoMarke.valueOf("audi".toUpperCase());
		
		
		
		for (AutoMarke marke: AutoMarke.values()) {
			
//			make.ordinal(Skoda);
			switch(marke) {
			default:
				System.out.println("Nedarysim nieko");
				break;
			case BMW:
				System.out.println("Darysim kazka BMW");
				break;
			case SKODA:
				System.out.println("Daysim kazka Skoda " + marke.ordinal());
		}
	}
	
}
	public enum AutoMarke{
		BMW("180KW"), AUDI("3KW"), SKODA("30KW"), MERCEDESBENZ("300KW");
		
		private String variklis;
		
		AutoMarke(String variklis) {
			this.variklis = variklis;
			
		}
		public String getVariklis() {
			return variklis;
		}
	}
}
