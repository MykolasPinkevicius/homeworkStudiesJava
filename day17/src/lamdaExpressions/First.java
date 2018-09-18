package lamdaExpressions;

/**
 * Parasykite parametrizuota (generic) klase,
 * kuri realizuoja E tipo objektu saugykla.
 * Taip pat padarykite kad juos galima iteruoti dviem budais:
 * - ta pacia tvarka kaip ir ideta
 * 	ir atvirkstine tvarka.
 * 
 * @author MINDAUGASRamanauskas
 *
 */
public class First {

	public static void main(String[] args) {
		
		ObjectStore<Zmogus> objStore = new ObjectStore<>();
		objStore.add(new Zmogus("Petras", "Petraitis"));
		objStore.add(new Zmogus("Vardenis", "Pavardenis"));
		objStore.add(new Zmogus("Jonas", "Jonaitis"));
		
		// iterate from begining
		printObjectStore(objStore);
		
		System.out.println("--------------------------------");
		
		// iterated from the end
		objStore.reverseOrder();
		printObjectStore(objStore);
	}
	
	private static <T> void printObjectStore(ObjectStore<T> store) {
		for (T elem : store.getElements()) {
			System.out.println(elem);
		}
	}

}
