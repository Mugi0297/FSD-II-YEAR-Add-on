package session3;

public class ConstructorEx {

	public ConstructorEx(){
		System.out.println("Default Constructor");
	}
	
	public ConstructorEx(String name, String age) {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Parameterized Constructor");
	}
	
	public int sum(int a, int b) {
		int res = a + b;
		return res;
	}
	
	public static void main(String[] args) {
		ConstructorEx cx = new ConstructorEx();
		ConstructorEx ce = new ConstructorEx("Mugilan", "27");
		System.out.println(ce.sum(5, 10));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
