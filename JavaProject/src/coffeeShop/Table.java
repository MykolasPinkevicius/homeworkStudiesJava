package coffeeShop;

public class Table {

	public int tableNumber;
	public boolean tableFree;
	public double totalPrice;
	public double tip = totalPrice / 10;

	public Table(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Table(int tableNumber, boolean tableFree) {
		this.tableNumber = tableNumber;
		this.tableFree = tableFree;
	}

	public Table(boolean tableFree) {
		this.tableFree = tableFree;
	}
}
