
public class Owner implements Comparable<Owner> {

	public String name;
	public String lastname;
	
	public Owner(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Override
	public int compareTo(Owner Own) {
		int compareResult = lastname.compareToIgnoreCase(Own.getLastname());
		
		if (compareResult == 0) {
			compareResult = name.compareToIgnoreCase(Own.getName());
		}
		
		return compareResult;
	}
	
}
