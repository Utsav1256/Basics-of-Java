package Array_Sanket;

public class MultiplicationOfMatrix {

	public static void printM(int[][] B) {
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				System.out.print(B[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
//		int[][] m2 = {{1, 1}, {1, 2}, {2, 1}};
		int[][] m1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] m2 = {{1, 1}, {1, 2}, {2, 1}};
		int[][] m3 = new int[m1.length][m2[0].length];
		
		
		int i = 0;
		while(i < m1.length) {
			int j = 0;
			while(j < m2[0].length) {
				int k = 0;
				int result = 0;
				while(k < m1[0].length) {
					result += m1[i][k] * m2[k][j];
					k++;
				}
				m3[i][j] = result;
				j++;
			}
			
			i++;
		}
		
		printM(m3);
	}

}
