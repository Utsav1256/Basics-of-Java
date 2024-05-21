package Array_Sanket;
import java.util.ArrayList;
import java.util.Arrays;


public class SetMatrixZeroes {
	

	public static void printM(int[][] B) {
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] m = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
//		int[][] m = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
		printM(m);
		
		ArrayList <int[]> zeroIndexes = new ArrayList<>();
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				if(m[i][j] == 0) {
					int[] a = {i, j};
					zeroIndexes.add(a);
				}
			}
		}
		for(int[] innerArray : zeroIndexes) {
			System.out.println(Arrays.toString(innerArray));
		}
		System.out.println(zeroIndexes.get(0)[0]);
		System.out.println(zeroIndexes.get(0)[1]);
		
		for(int i = 0; i < zeroIndexes.size(); i++) {
//			for(int j = 0; j < zeroIndexes.get(0).length; j++) {
			
				for(int k = 0; k < m[0].length; k++) {
					m[zeroIndexes.get(i)[0]][k] = 0;
				}
				for(int k = 0; k < m.length; k++) {
					m[k][zeroIndexes.get(i)[1]] = 0;
				}
//			}
			
		}
	printM(m);
		
//		for(int i = 0; i < m.length; i++) {
//			for(int j = 0; j < m[0].length; j++) {
//				if(m[i][j] == 0) {
//					for(int k = 0; k < m[0].length; k++) {
//						m[i][k] = 0;
//					}
//					for(int k = 0; k < m.length; k++) {
//						m[k][j] = 0;
//					}
//				}
//				
//			}
//		}
//		printM(m);

}
}