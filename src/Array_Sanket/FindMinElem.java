package Array_Sanket;

// Given an array Find min elem of the array
import java.util.Scanner;
public class FindMinElem {

	public static int findMin(int[] A) {
		int min = Integer.MAX_VALUE;
		for(int val : A) {
			if(val < min) {
				min = val;
			}
		}
		return min;
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		if(size <= 0) return;
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		for(int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		int result = findMin(arr);
		
		System.out.print(result);
		
	}

}
