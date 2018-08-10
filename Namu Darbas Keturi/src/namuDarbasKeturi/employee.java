package namuDarbasKeturi;

public class employee implements payment{

	public String firstName;
	
	public String lastName;
	
	public long bankAccount;
	
	public int ammount;
	
	public employee(String firstName, String lastName, long bankAccount, int ammount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bankAccount = bankAccount;
		this.ammount = ammount;
		
	}
		@Override
		public String toString() {
			return "Employee " + firstName + " " + lastName + ", Bank Account = LT" + bankAccount + ", Ammount of payment = "
		+ ammount;
	}
}
