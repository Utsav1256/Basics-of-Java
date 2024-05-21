package Array_Sanket;
//  {{1, 2, 3, 4},
//  {5, 6, 7, 8},
//  {9, 10, 11, 12}}
//o/p: 1 5 9 10 6 2 3 7 11 12 8 4 

//  {{1, 2, 3},
//   {4, 5, 6}, 
//   {7, 8, 9}}
// o/p: 1 4 7 8 5 2 3 6 9 

public class Print2DArrWave {

	public static void printWave(int[][] A) {
		int i = 0;
		while(i < A[0].length) {
			int j = 0;
			while(j < A.length) {
				System.out.print(A[j][i] + " ");
				j++;
			}
			i++;
			j = A.length - 1;
			if(i >= A[0].length) {
				break;
			}
			while(j >= 0) {
				System.out.print(A[j][i] + " ");
				j--;
			}
			i++;
		}
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		printWave(arr1);
		System.out.println();
		printWave(arr2);
	}
	
	

}
