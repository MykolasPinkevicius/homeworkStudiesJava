import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	public int compare(Car a1, Car a2) {
		if (a1.getOwn() == null && a2.getOwn() == null) {
			return 0;
		}
		
		int compareResult = a1.getOwn().compareTo(a2.getOwn());
		if (compareResult == 0) {
			compareResult = a1.compareTo(a2);
		}
		
		return compareResult;
	}
	
	
//	@Override
//	public int compare(Car pirmas, Car antras) {
//		if (pirmas.getLicensePlate().compareToIgnoreCase(antras.getLicensePlate()) == 0 ) {
//			if (pirmas.getModel() == antras.getModel()) {
//				return 0;
//			} else if (pirmas.getModel().compareToIgnoreCase(antras.getModel()) > 0) {
//				return -1;
//			} else {
//				return 1;
//			}
//			} else if (pirmas.getLicensePlate().compareToIgnoreCase(antras.getLicensePlate()) > 0) {
//				return -1;
//			} else {
//				return -1;
//			}
//		}
	}
