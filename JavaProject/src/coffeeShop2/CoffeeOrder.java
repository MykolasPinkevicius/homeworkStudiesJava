package coffeeShop2;

public class CoffeeOrder {

	private int tableNumber;
	private String order;
	private String type;
	private int orderNumber;
	private int quantity;
	
	public CoffeeOrder () {
		setOrderNumber (1000);
		setTableNumber (1);
		setOrder ("testorder");
		setType ("testtype");
		setQuantity (1);
	}
	
	double totalPriceWithTip;
	double price;
	double tips;
	
	
	
	
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalPriceWithTip() {
		return totalPriceWithTip;
	}

	public void setTotalPriceWithTip(double totalPriceWithTip) {
		this.totalPriceWithTip = totalPriceWithTip;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTips() {
		return tips;
	}

	public void setTips(double tips) {
		this.tips = tips;
	}

	public double coffeePrice() {
		if(getOrder().equals("Black")) {
			price = 2.0 * getQuantity();
			} 
			else if(getOrder().equals("White")) {
				price = 2.5 * getQuantity();
			} 
			else if(getOrder().equals("Cappuccino")) {
				price = 3.0 * getQuantity();
			} 
			else if(getOrder().equals("Latte")) {
				price = 3.5 * getQuantity();
			} 
			else if(getOrder().equals("Amerikano")) {
				price = 2.5 * getQuantity();
			} 
		else {
			System.out.println("You entered wrong Coffee name");
		}
		return price;
	}
	
	public double totalPriceWithTip() {
		if(getType().equals("Notips")) {
			tips = 0.0;
		} else if(getType().equals("Withtips")) {
			tips = getTips();
		}
		return totalPriceWithTip = price + tips;
	}
}


