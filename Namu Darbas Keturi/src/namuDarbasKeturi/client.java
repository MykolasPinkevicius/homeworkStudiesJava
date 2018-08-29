package namuDarbasKeturi;

public class client implements payment{

	public String firstName;
	
	public String lastName;
	
	public long bankAccount;
	
	public int ammount;
	
	public client(String firstName, String lastName, long bankAccount, int ammount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.bankAccount = bankAccount;
		this.ammount = ammount;
	}
		@Override
		public String toString() {
			return "Client " + firstName + " " + lastName + ", Bank Account = LT" + bankAccount + ", Ammount of payment = "
		+ ammount;
		}
		@Override
		public long bankAccount(){
			return long bankAccount
		};
		public void ammount(){
			
		};
		public void accountOwner() {
			
		};
		
	}

