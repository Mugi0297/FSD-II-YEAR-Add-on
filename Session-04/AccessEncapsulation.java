package session3;

public class AccessEncapsulation {

	public static void main(String[] args) {
		Encapsulation ee  = new Encapsulation();
		ee.setName("Mugilan");
		ee.setLocation("Vellore");
		
		System.out.println(ee.getName());
		System.out.println(ee.getLocation());
	}
}
