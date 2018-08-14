package school;

public class UzklausosSiuntimas {

	
	public static final String api = "key=sZlFz93cslu0odzEZAtD";
	public String city;
	public String street;
	public int number;
	
	public UzklausosSiuntimas(String city, String street, int number) {
	this.city = city;
	this.street = street;
	this.number = number;
	
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static String getApi() {
		return api;
	}

	@Override
	public String toString() {
		return "http://postit.lt/API/v2/?" + api + "&city=" + city + "&street=" + street + "&number=" + number;
	}
}
