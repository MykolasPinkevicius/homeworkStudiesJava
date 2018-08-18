package coffeeShop;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Waitress {

	public static void main(String[] args) throws InterruptedException {
		char euroSign = '\u20AC';
		
		String coffeeChoice;
		int coffeeCupsNumber = 1;
		Drinks blackCoffee = new Drinks(2.0, "Black Coffee", 1);
		Drinks whiteCoffee = new Drinks(2.5, "White Coffee", 2);
		Drinks cappuccino = new Drinks(3.0, "Cappuccino", 3);
		Drinks latte = new Drinks(3.5, "Latte", 4);
		Drinks amerikano = new Drinks(2.5, "Amerikano", 5);
		Scanner scan = new Scanner(System.in);
		Client client1 = new Client("Client 1", null);
		Saskaita Check1 = new Saskaita(0.0);
		Table table1 = new Table(1, true);
		Table table2 = new Table(2, true);
		Table table3 = new Table(3, true);
		Table table4 = new Table(4, true);
		Table table5 = new Table(5, true);
		Table table6 = new Table(6, true);
		Table table7 = new Table(7, true);
		Table table8 = new Table(8, true);
		Table table9 = new Table(9, true);
		Table table10 = new Table(10, true);
		System.out.println("Welcome to Coffee CoffeeShop");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("My name is Ieva");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Which table you want to take?");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("Choose Table number typing from 1 to 10 in the system");
		TimeUnit.SECONDS.sleep(2);
		String tableCustomerSits = scan.nextLine();
		switch (tableCustomerSits) {
		case "1":
			table1.tableFree = false;
			System.out.println("Please sit to table 1");
			TimeUnit.SECONDS.sleep(4);
			System.out.println("Here's our menu. Please choose your drinks. Type drink number to order that drink");
			TimeUnit.SECONDS.sleep(4);
			System.out.println(
					blackCoffee.number + ". " + blackCoffee.drinksName 
					+ " price is " + blackCoffee.price + euroSign + "\n" + 
					whiteCoffee.number + ". " + whiteCoffee.drinksName 
					+ " price is " + whiteCoffee.price + euroSign + "\n" + 
					cappuccino.number + ". " + cappuccino.drinksName
					+ " price is " + cappuccino.price + euroSign + "\n" + 
					latte.number + ". " + latte.drinksName
					+ " price is " + latte.price + euroSign + "\n" + 
					amerikano.number + ". " + amerikano.drinksName
					+ " price is " + amerikano.price + euroSign + "\n"
					);
			TimeUnit.SECONDS.sleep(2);
			coffeeChoice = scan.nextLine();
			TimeUnit.SECONDS.sleep(2);
			switch (coffeeChoice) {
			case "1":
				System.out.println("How many cups?");
				coffeeCupsNumber = scan.nextInt();
				TimeUnit.SECONDS.sleep(2);
				break;
			case "2":
				System.out.println("How many cups?");
				coffeeCupsNumber = scan.nextInt();
				TimeUnit.SECONDS.sleep(2);
				break;
			case "3":
				System.out.println("How many cups?");
				coffeeCupsNumber = scan.nextInt();
				TimeUnit.SECONDS.sleep(2);
				break;
			case "4":
				System.out.println("How many cups?");
				coffeeCupsNumber = scan.nextInt();
				TimeUnit.SECONDS.sleep(2);
				break;
			case "5":
				System.out.println("How many cups?");
				coffeeCupsNumber = scan.nextInt();
				TimeUnit.SECONDS.sleep(2);
				break;
			}
			break;
		case "2":
			table2.tableFree = false;
			System.out.println("Please sit to table 2");
			break;
		case "3":
			table3.tableFree = false;
			System.out.println("Please sit to table 3");
			break;
		case "4":
			table4.tableFree = false;
			System.out.println("Please sit to table 4");
			break;
		case "5":
			table5.tableFree = false;
			System.out.println("Please sit to table 5");
			break;
		case "6":
			table6.tableFree = false;
			System.out.println("Please sit to table 6");
			break;
		case "7":
			table7.tableFree = false;
			System.out.println("Please sit to table 7");
			break;
		case "8":
			table8.tableFree = false;
			System.out.println("Please sit to table 8");
			break;
		case "9":
			table9.tableFree = false;
			System.out.println("Please sit to table 9");
			break;
		case "10":
			table10.tableFree = false;
			System.out.println("Please sit to table 10");
			break;
		}

//		if (tableCustomerSits.equals("1")) {
//			table1.tableFree = false;
//			System.out.println("Please sit to table 1");
//		}
//		System.out.println(table1.tableFree);
//		
//		if (tableCustomerSits == "2") {
//			System.out.println("Please sit to table 2");
//		}
//		if (tableCustomerSits == "3") {
//			System.out.println("Please sit to table 3");
//		}
//		if (tableCustomerSits == "4") {
//			System.out.println("Please sit to table 4");
//		}
//		if (tableCustomerSits == "5") {
//			System.out.println("Please sit to table 5");
//		}
//		if (tableCustomerSits == "6") {
//			System.out.println("Please sit to table 6");
//		}
//		if (tableCustomerSits == "7") {
//			System.out.println("Please sit to table 7");
//		}
//		if (tableCustomerSits == "8") {
//			System.out.println("Please sit to table 8");
//		}
//		if (tableCustomerSits == "9") {
//			System.out.println("Please sit to table 9");
//		}
//		if (tableCustomerSits == "10") {
//			System.out.println("Please sit to table 10");
//		}
//		
		scan.close();
	}

}
