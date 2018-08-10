package namuDarbasKeturi;

//import java.util.Arrays;

public class system {
	
	public static void main(String[] args) {
		
		client[] clients = {
				new client("Karolis", "Sapalinskas", 121234123412341234L, 1500),
				new client("Tadas", "Napalinksas", 121234123412341235L, 1500),
				new client("Simas", "Papalinkas", 121234123412341236L, 1500),
				new client("Klaudiju", "Rapalinskas", 121234123412341237L, 1500)
		};
		employee[] employees = {
				new employee("Karolina", "Sapalinskyte", 434321432143214321L, 1400),
				new employee("Tada", "Napalinskyte", 434321432143214322L, 1400),
				new employee("Sima", "Papalinskyte", 434321432143214323L, 1400),
				new employee("Klaudija", "Rapalinskyte", 434321432143214324L, 1400)
		};
		
		//Kaip isvesti is ciklo ju mokejimo informacija ir atspauzdinti.
		for (client clients1:clients) {
			System.out.println(clients1);
		}
		for (employee employees1:employees) {
			System.out.println(employees1);
		}
//		System.out.println(Arrays.toString(clients));
//		System.out.println(Arrays.toString(employees));
		
	}
	
}
