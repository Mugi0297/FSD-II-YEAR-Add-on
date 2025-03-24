package session5;

public class OverLoadingEx {

	int c; //Instance variable
	
	public void add(int a, int b) {
		c = a+b;   
		System.out.println("The value of integer c: "+c);
	}
	
	public void add(float a, int b) {
		float c = a+b;  //local variable
		System.out.println("The value of float c: "+c);
	}
	
	public void add(float a, double b) {
		double c = a+b;  //local variable
		System.out.println("The value of double c: "+c);
	}
	
	public static void main(String[] args) {
		OverLoadingEx ole = new OverLoadingEx();
		ole.add(25, 10);
		ole.add(32.5f, 10);
		ole.add(10.54f, 12.25478);
	}
	
	
	
	
	
	
	
}
