package coffeeShop2;

import java.util.Scanner;

public class Mainer {

	public static void main(String[] args) {

		int numberCoffeeOrdered;
		int numberOfCurrentOrder = 1;
		
		Scanner numberCoffeeOrderedScanner = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mike Coffee Shop System");
		System.out.println("-----------------------");
		System.out.println("");
		System.out.println("Enter a number of coffee orders");
		numberCoffeeOrdered = numberCoffeeOrderedScanner.nextInt();
		System.out.println("");
		
		int i = 1;
		
		while (i <= numberCoffeeOrdered) {
			System.out.println("Enter coffee order #" + numberOfCurrentOrder);
			System.out.println("--------------------");
			
			CoffeeOrder c1 = new CoffeeOrder();
			System.out.println("Order Number");
			c1.setOrderNumber(scan.nextInt());
			if (c1.getOrderNumber() <= 1000) {
				System.out.println("Please enter higher number than 1000");
				c1.setOrderNumber(scan.nextInt());
			}
			
			scan.nextLine();
			System.out.println("Table Number");
			c1.setTableNumber(scan.nextInt());
			System.out.println("Enter Coffee Order");
			c1.setOrder(scan.nextLine().trim());
			c1.setOrder(scan.nextLine().trim());
			System.out.println("How many?");
			c1.setQuantity(scan.nextInt());
			System.out.println("Tips (Type Notips or Withtips)");
			c1.setType(scan.nextLine());
			c1.setType(scan.nextLine());
			if (c1.getType().equals("Withtips")) {
			System.out.println("Enter Tips");
			c1.setTips(scan.nextInt());
			} else if (c1.getType().equals("Notips")) {
				System.out.println("No Tips huh?");
			}
			
			System.out.println("");
			System.out.println("Coffee orders " + numberOfCurrentOrder);
			System.out.println("-------------  ");
			System.out.println("Order Number" + c1.getOrderNumber());
			
		System.out.println("Order:" + c1.getOrder());
		System.out.println("Coffee Price " + c1.coffeePrice());
		System.out.println("--------------------");
		System.out.println("");
		System.out.println("Tips " + c1.getTips());
		System.out.println("Total Price " + c1.totalPriceWithTip());
		System.out.println("--------------------");
		
		numberOfCurrentOrder = numberOfCurrentOrder + 1;
		i++;
		}
		
//		// Problema: Negalima ideti daugiau uzsakymu, tik vieno tipo uzsakyma.
//		
//		for(CoffeePrices p: CoffeePrices.values()) {
//			System.out.println(p.getPricesOfCoffee());
//		}
//		System.out.println(CoffeePrices.values());
//		
		scan.close();
		numberCoffeeOrderedScanner.close();
	}
}
