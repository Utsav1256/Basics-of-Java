package Array_Sanket;

import java.util.Scanner;

//Rotate the given array according to value of k (rotating factor)

public class RotateArray {

	public static void rotateArr(int[] A, int k) {
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the Array : ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Enter value of rotating factor : ");
		int k = scan.nextInt();

		System.out.println("Given Array : ");

		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		rotateArr(arr, k);
		
		System.out.println("Result Array : ");

		for(int val : arr) {
			System.out.print(val + " ");
		}
	}

}
