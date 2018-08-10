import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainForCars {
	
	public static void main(String[] args) {
		
		List<Car> autolist = Arrays.asList(
				new Car("BMW735", "Bmw", new Owner("Kestas", "Kalvinskas")),
				new Car("BMW750", "Bmw", new Owner("Petras", "Orlauskas")),
				new Car("FRD969", "Volkswagen", new Owner("Mykolas", "Pinkevicius")),
				new Car("KLM814", "Mini", new Owner("Kilputis", "Mazuciukas")),
				new Car("LAR001", "Volvo", new Owner("Petriukas", "Artojas")),
				new Car("GTH110", "Hyundai", new Owner("Arunas", "Pinkevicius")),
				new Car("ABN710", "Kia", new Owner("Karmen", "Gulsciuk")));
		
//		System.out.println("-----Default sorting -----\n");
//		Collections.sort(autolist);
//		for (Car automobil : autolist) {
//			System.out.println(automobil);
//		}
		
//		System.out.println("\n ----- Custom sorting ----- \n");
		Collections.sort(autolist,  new CarComparator());
		for (Car auto : autolist) {
			System.out.println(auto);
		}
				
		
	}
	
}
