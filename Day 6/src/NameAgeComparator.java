
import java.util.Comparator;

//	public static void main(String[] args) {
		
		public class NameAgeComparator implements Comparator<Mokinys> {
			
			@Override
			public int compare(Mokinys pirmas, Mokinys antras) {
				if (pirmas.getVardas().compareToIgnoreCase(antras.getVardas()) == 0 ) {
					if (pirmas.getAge() == antras.getAge()) {
						return 0;
				} else if (pirmas.getAge() > antras.getAge()) {
						return -1;
				} else {
						return 1;
				}
				} else if (pirmas.getVardas().compareToIgnoreCase(antras.getVardas()) > 0 ) {
					return 1;
				} else {
					return -1;
				}
			}
		}
