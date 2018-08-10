package goodPracticesObjectsAndClasses;

public class Person {
	String name;
	int Age;
	
	public Person(String name) {
		this.name = name;
		System.out.println("Person created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public void sayHelloTo(Person person) {
		System.out.println(getName() + " said Hello to " + person.getName() );
		// TODO Auto-generated method stub
		
	}
	
}
