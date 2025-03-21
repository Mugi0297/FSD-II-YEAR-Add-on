package session3;

public class MultiDimensionalArrayEx {

	public static void main(String[] args) {
		int[][] a = {{2,4}, {5,7}, {7,3}, {3, 1}};
		
		//Access all elements using nested for loop
//		for(int i = 0; i<a.length; i++) {
//			for(int j = 0; j<a[i].length; j++){
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		
		for(int[] i : a) {   //2D to 1D
			for(int j: i) {  //1D to variable
				System.out.print(j);  //print the variable
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
