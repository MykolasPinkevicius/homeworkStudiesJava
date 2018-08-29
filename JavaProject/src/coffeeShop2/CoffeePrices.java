package coffeeShop2;

public enum CoffeePrices {

	BLACK(2.0), 
	WHITE(2.5), 
	CAPPUCCINO(3.0), 
	LATTE(3.5), 
	AMERICANO(2.5);
	
	private double pricesOfCoffee;
	
	private CoffeePrices(double pricesOfCoffee) {
		this.pricesOfCoffee = pricesOfCoffee;
	}
	public double getPricesOfCoffee() {
		return pricesOfCoffee;
	}
	
}