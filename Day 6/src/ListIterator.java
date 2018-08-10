import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String args[]) {
		
		List<Integer> skaiciai = new ArrayList<>();
		
		skaiciai.add(5);
		skaiciai.add(10);
		skaiciai.add(5);
		skaiciai.add(15);
		skaiciai.add(5);
		skaiciai.add(25);
		
		Iterator<Integer> iterator = skaiciai.iterator();
		while (iterator.hasNext()) {
			Integer sk = iterator.next();
			
			if (sk == 5) {
				iterator.remove();				
			}
		}
		
		List<Mokinys> mokiniai = new ArrayList<>();
		mokiniai.add(new Mokinys("Petras", 15));
		mokiniai.add(new Mokinys("Petras", 18));
		mokiniai.add(new Mokinys("A", 18));
		mokiniai.add(new Mokinys("Petras", 13));
		
		Collections.sort(mokiniai, new NameAgeComparator());
		
//		Collections.sort(mokiniai);
		
		for (Mokinys mok : mokiniai) {
			System.out.println(mok);
		}
		
		for (Integer sk : skaiciai) {
			System.out.println("Turetu buti skaicius: " + sk);
		}
		
	}
	}

		
//		for (Integer sk : skaiciai) {
//			if (sk == 5) {
//				skaiciai.remove(sk);
//			}
//		}
		
	

		
		
//		We cannot use for for removing data from lists for (Integer sk : skaiciai) {
//			if (sk == 5) {
//				skaiciai.remove(sk);
//			}
//		}
//		Iterator<Integer> iterator = skaiciai.iterator();
//		while (iterator.hasNext()) {
//			Integer sk = iterator.next();
//			
//			if (sk == 5) {
//				iterator.remove();				
//			}
//		}
		
		
//		Iterator<Integer> iterator = skaiciai.iterator();
//		
//		while(iterator.hasNext()) {
//			Integer sk = iterator.next();
			
//			if (sk == 5) {
//				iterator.next();
//			}
//				System.out.println("Turetu buti skaicius: " + sk);
//			}
//		}
//		
		
		
		
//	}


