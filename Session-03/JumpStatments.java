package session3;

public class JumpStatments {

	public static void main(String[] args) {
		int i = 1;
		
		while(i<10) {
			if(i==5) {
//				break;
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
