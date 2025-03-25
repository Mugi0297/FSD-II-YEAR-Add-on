package session6;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			
			System.out.println("Trying to divide by 0...");
			int res = 10/0;
			System.out.println("Result: "+res);
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("finally block executed.....");
		}
	}
}









