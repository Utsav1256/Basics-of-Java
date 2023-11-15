package Arrays;

import java.util.Scanner;

public class Array3 {
	
	public static int[] takeInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of the Array : ");
		int size = scan.nextInt();
		
		int input[] = new int[size];

		for(int i = 0; i < size; i++) {
			System.out.println("Enter element at position " + (i+1) + " : ");
			input[i] = scan.nextInt();
		}
		return input;
	}
	
	public static int findLargest(int arr[]) {
		int max = Integer.MIN_VALUE;
//		System.out.println(max);
		for(int i = 0; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void print(int max) {
			System.out.print("Largest Element of the given Array is : " + max);	
	}
	
	public static void main(String[] args) {
		 
		int arr[] = takeInput();
		int largest = findLargest(arr);
		print(largest);
	}

}
