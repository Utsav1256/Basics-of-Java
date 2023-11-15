package Arrays;

import java.util.Scanner;

public class Array2 {

	public static int[] takeInput() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of the Array : ");
		int size = scan.nextInt();
		
		int input[] = new int[size];

		for(int i = 0; i < size; i++) {
			System.out.println("Enter element at position " + (i+1) + " : ");
			input[i] = scan.nextInt();
		}
		
		return input; // returning the array
	}
	
	public static void print(int input[]) { // taking arrays as input
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");	
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = takeInput();
		print(arr);
		
		
	}

}
