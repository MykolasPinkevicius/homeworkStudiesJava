package coffeeShop;

public class Drinks {

	public double price;
	public String drinksName;
	public int number;
	public int cups;

	public Drinks(double price, String drinksName, int number) {
		this.price = price;
		this.drinksName = drinksName;
		this.number = number;
	}

	public Drinks(double price) {
		this.price = price;
	}

	public Drinks(String drinksName) {
		this.drinksName = drinksName;
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) {
		this.cups = cups;
	}
	
}
