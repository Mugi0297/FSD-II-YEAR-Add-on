package programs;

public class Operators {

	public static void main(String[] args) {
		int a = 5, b = 8;
		
		//Arithmetic 
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("multiplication: "+(a*b));
		
		//Relational
		System.out.println("Equal to: "+(a==b));
		System.out.println("Not Equal: "+(a!=b));
		System.out.println("Greater than: "+(a>b));
		System.out.println("Less than equal to: "+(a<=b));
		
		//Logical &&(AND), ||(OR), !(NOT)
		boolean condition1 = true, condition2 = false;
		
		System.out.println("Logical AND: "+(condition1 && condition2));
		System.out.println("Logical OR: "+(condition1 || condition2));
		System.out.println("Logical NOT: "+(!condition1));
		
		//unary
		System.out.println("Unary negation: "+(~a)); //5
		System.out.println("Unary negation: "+(~b)); 
		System.out.println("Post Increment: "+(a++)); //5(6)
		System.out.println("Pre Decrement: "+(--b)); //7
		
		
		//Assignment
		a+=5; //a = a+5
		System.out.println("+=: "+a);
		
		//Ternary ? :
		String res = (a>b)?"a is greater" : "b is greater";
		System.out.println("Result: "+ res);
		
		//Bitwise
		/***
		 * AND-->&
		 * OR-->|
		 * NOT-->~
		 * XOR-->^
		 */
		
		
		
		
		
		
		
		
		
	}
}
