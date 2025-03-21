package session3;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "Java Program";
		//1.length
//		System.out.println(s1.length());
		
		//2.equals()
		//3.equalIgnoreCase()
	/*	Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String username = sc.nextLine();
		
		System.out.println("Enter password: ");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")) {
			System.out.println("Success");
		}else {
			System.out.println("Error 404 Found ");
		}*/
		
		/*String s2 = "Mugilan";
		String s3 = "Mugilan";
		
		System.out.println(s2.equals(s3));*/
		
		//==
		/*String s4 = "Mugilan";
		String s5 = "Mugilan";
		
		System.out.println(s4==s5);*/
		String name = new String("Mugilan");
		String name1 = new String("Mugilan");
		System.out.println(name==name1);
		
		//compareTo
		//s1>s2-->positive number
		//s1<s2-->negative number
		//s1==s2-->0
		
		/*String s6 = "heuits";
		String s7 = "hellos";
		
		System.out.println(s6.compareTo(s7));	*/	
		
		//concat()
		/*String str1 = "Static";
		String str2 = new String("Program");
		System.out.println(str1.concat(str2));*/
		
		//toCharArray()
		String str3 = "Welcome to Java";
		System.out.print("Value of method: ");
		char[] ch = str3.toCharArray();
		for(char st: ch) {
			System.out.println(st);
		}
		
		//System.out.println(str3.toCharArray());
		
		/*//subString()
		System.out.println(str3.substring(5));
		System.out.println(str3.substring(0, 9));
		
		//intern
	/*	String clg = "Kgisl";
		String clg1 = new String("Kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);*/
		
		
		
		
		
	}
}
