package Array_Sanket;
//[                       [
// [1, 2, 3],   		    1  4
// [4, 5, 6]     -->	    2  5
//]							3  6
//						  ]

public class TransposeOfMatrix {
	
	public static void printM(int[][] B) {
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] transposeOfM(int[][] A) {

		int[][] arr1 = new int[A[0].length][A.length];
		
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < A[0].length; j++) {
				arr1[j][i] = A[i][j];
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//		int[][] arr = {{1, 2, 3}, {4, 5, 6}};
		int[][] result = transposeOfM(arr);
		
		printM(arr);
		System.out.println("--------------");
		printM(result);
		
	}

}
