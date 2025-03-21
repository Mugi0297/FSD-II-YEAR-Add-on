package programs;

import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter ur mobile no:");
		int mob = obj.nextInt();
		
		System.out.println("Enter ur name: ");
		String name = obj.next();
		
		System.out.println("Enter ur address: ");
		String addr = obj.next();
		
		System.out.println("Info entered");
	}
}
