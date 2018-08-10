package goodPracticesObjectsAndClasses;

public class goodPracticesObjectsClasses {

	public static void main(String[] args) {
		
		
		Person john = new Person("John");
		john.name = "John";
		john.setAge(20);
		Person bob = new Person("Bob");
		bob.name = "Bob";
		bob.setAge(25);
		
		john.sayHelloTo(bob);
		bob.sayHelloTo(john);
		
		System.out.println(john.getName() + " is " + john.getAge() + " years old");
		System.out.println(bob.getName() + " is " + bob.getAge() + " years old");

		String pavadinimas = "";
		switch ("LT") {
		case "LT":
			pavadinimas = "Lietuva";
			break;
		case "UK":
			pavadinimas = "United Kingdom";
			break;
		case "LV":
			pavadinimas = "Latvija";
			break;
		default:
			pavadinimas = "Newaišku kas";
		}
		System.out.println(pavadinimas);
		
		//Do While ciklas. Don't use it with for cicle. Because same variable suma.
		/* int i = 2, suma = 0;
		do {

		suma += i;
		i += 2;

		} while (i <= 100);
		System.out.println("2 + 4 + ... + 100 = " + suma);
		*/
		// for ciklas Don't use it with for cicle. Because same variable suma.
		
		/* int suma = 0;
		for (int i = 1; i <= 100; i++) {

		suma += i;

		};
		System.out.println("1 + 2 + ... + 100 = " + suma);
		*/
		
		/* int[] a = {10, 50, -5, 15};
		int suma = 0;
		for (int i = 0; i < a.length; i++) {

		suma += a[i];

		};
		System.out.println("Suma = " + suma);
		*/
		/*
		int[] a = {15, 20, 5, 0, -5, 80};
		int suma = 0;
		for (int i = 0; i < a.length; i++) {

		if (a[i] == 0) {
//		break;
		// Sioje vietoje break for e nutraukia skaiciavima, kai A masyvo viena is reiksmiu buna 0.
		
		
		}
		suma += a[i];
		}
		System.out.println("Suma yra = " + suma);
		*/
		
			
//			int[] a = {2, 0, 3, 0, -5, 0};
//			int sandauga = 1;
//			for (int e : a) {
//			if (e == 0) {
//			continue;
//			}
//			sandauga *= e;
//
//			System.out.println(sandauga);
//			}
//		
		
//		int [] a = {5,6,10,15,8,4};
//		int [] b = {8,5,3};
//		float averagea = 0;
//		float averageb = 0;
//		
//		for (int i = 0; i < a.length; i++) {
//			averagea += a[i];
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			averageb += b[i];
//		}
//		
//		
//		double averagesa = averagea / a.length;
//			System.out.println("Average of Array A is = " + averagesa);
//		double averagesb = averageb / b.length;
//			System.out.println("Average of Array B is = " + averagesb );
//			
//			
			
			int a = 100;
			int b = a;
			a = 200;
			System.out.println(b);
	}
}
