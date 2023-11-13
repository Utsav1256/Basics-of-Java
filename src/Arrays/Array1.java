package Arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		arr[1]=15;
		System.out.println(arr[1]);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the Array : ");
		int size = scan.nextInt();
		int input[] = new int[size];

		for(int i = 0; i < size; i++) {
			System.out.println("Enter element at position " + (i+1) + " : ");
			input[i] = scan.nextInt();
		}
		for(int i = 0; i < size; i++) {
			System.out.print(input[i] + " ");
			
		}
	}

}
