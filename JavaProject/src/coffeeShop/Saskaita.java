package coffeeShop;

public class Saskaita {

	public double totalPrice;
	public double tip = totalPrice / 10;

	
	public Saskaita (double totalPrice) {
		this.totalPrice = totalPrice;
	}


	public double getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
