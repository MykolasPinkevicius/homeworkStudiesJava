
public class Car implements Comparable<Car> {

	private String LicensePlate;
	private String Model;
	private Owner Own;
	
	public Car(String LicensePlate, String Model, Owner Own){
		this.LicensePlate = LicensePlate;
		this.Model = Model;
		this.Own = Own;
	}
	@Override
	public int compareTo(Car ca) {
		return LicensePlate.compareToIgnoreCase(ca.getLicensePlate());
	}
	
	
	public String getLicensePlate() {
		return LicensePlate;
	}



	public void setLicensePlate(String licensePlate) {
		LicensePlate = licensePlate;
	}



	public String getModel() {
		return Model;
	}



	public void setModel(String model) {
		Model = model;
	}



	public Owner getOwn() {
		return Own;
	}



	public void setOwn(Owner own) {
		Own = own;
	}
	@Override
	public String toString() {
		return "Car License Plate " + getLicensePlate() + ", Model " + getModel() + ", Owner " + Own.getName() + " " + Own.getLastname();
	}

	


//	@Override
//	public String toString() {
//		return "Car LicensePlate - " + LicensePlate + ", Model=" + Model + ", Owner=" + Owner;
//	}
	
//	public int compareTo(Car antras) {
//		if (getLicensePlate().compareToIgnoreCase(antras.getLicensePlate()) == 0) {
//			if (getModel() == antras.getModel()) {
//				return 0;
//			} else if (getModel().compareToIgnoreCase(antras.getModel()) > 0) {
//				return -1;
//			} else {
//				return 1;
//			}
//			} else if (getLicensePlate().compareToIgnoreCase(antras.getLicensePlate()) > 0) {
//			return 1;
//			} else {
//			return -1;
//			}
//		}
}
