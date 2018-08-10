
public class Employee {

	public String name;
	public Address address;	
	
	@Override
	public String toString() {
		return "Employee " + name + " " + address;
	}

	public Employee(String name, String city, String address) {
		this.name = name;
		this.address = new Address(city, address);
	}
	
	public class Address{
		
		public String city;
		public String address;
		
		
		
		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public Address(String city, String address) {
			this.address = address;
			this.city = city;
		}



		@Override
		public String toString() {
			return city + " " + address;
		}
		
		
		
	}
	
}
