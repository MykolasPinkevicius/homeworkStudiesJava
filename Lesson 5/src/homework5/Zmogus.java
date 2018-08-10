package homework5;

public class Zmogus {

	public String firstName;
	public String lastName;
	private String socialCode;

public Zmogus(String firstName, String lastName, String socialCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialCode = socialCode;
	}
	@Override
	public String toString() {
		return "Name " + firstName + " " + lastName + socialCode + '\n';
	}

}