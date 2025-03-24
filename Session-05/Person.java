package session5;

public class Person {

	private String name;
	private int age;
	
	//Regular Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	//Copy constructor
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	//Method to display person details
	public void displayInfo() {
		System.out.println("Name: "+name+",Age: "+age);
	}
	
	
	

	
}
