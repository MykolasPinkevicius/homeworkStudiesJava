package generic;

import java.util.ArrayList;
import java.util.List;

public class NaujasNeparametrizuota {

	public <T, E> void printObject(T objektas) {
//		return objektas;
		
		List<T> listas = new ArrayList<>();
		listas.add(objektas);
		
		List<E> listas_2 = new ArrayList<>();
		
		
		
		
		System.out.print("");
	}
	
	public static void printObjectS(List<?> listas) {
	}
}
