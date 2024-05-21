package Arrays_Striver;

import java.util.Scanner;
//Find the Largest element in an array
//Problem Statement: Given an array, we have to find the largest element in the array.
public class Problem_1 {

public static int[] takeInput() {
		
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		
		int input[] = new int[size];

		for(int j = 0; j < size; j++) {
			input[j] = scan.nextInt();
		}
		
		
		return input;
	}
public static int findLargest(int[] arr) {
	int largest = arr[0];
	for(int i = 0; i < arr.length; i++) {
		if(largest < arr[i]) {
			largest = arr[i];
		}
	}
	return largest;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int arr[] = takeInput();
	    
	    int largest = findLargest(arr);
	    System.out.println("Largest: " + largest);
		
	}

}
