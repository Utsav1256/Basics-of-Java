package Array_Sanket;
// Reverse an array
import java.util.Scanner;
public class ReverseArray {
	
	public static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
		
	}
	
	public static void reverseArr(int[] A) {
//		int i=0, j=A.length-1;
//		while(i < j) {
//			swap(A, i, j);
//			i++;
//			j--;
//		}
		
		for(int i = 0, j= A.length-1; i < j; i++, j--) {
			swap(A, i, j);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		reverseArr(arr);
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
	}

}

// very Good ✅
