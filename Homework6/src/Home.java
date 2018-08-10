import java.util.HashSet;
import java.util.Set;

public class Home {

	public static void main(String[] args) {
		
		Employee[] employee = {
		new Employee("Aleksas", "Vilnius", "Kryziuociu kalvos g. 24"),
		new Employee("Martinas", "Siauliai", "Kryziuociu kalvos g. 25"),
		new Employee("Egle", "Druskininkai", "Kryziuociu kalvos g. 26"),
		};
		
		for (Employee e: employee) {
			System.out.println(e);
		}
		
		Set<String> cities = new HashSet<>();
		
		for (Employee e: employee) {
			cities.add(e.address.getCity());
		}
	
		System.out.println(cities.size() + " " + cities);
	
	}
}
