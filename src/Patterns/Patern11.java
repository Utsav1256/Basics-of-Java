package Patterns;

import java.util.Scanner;

public class Patern11 {
	public static void main(String[] args) {
		

		/*
	 	   ****
		   ***
		   **
		   *
		*/
			
//			No. of rows?? --> N = 4
//			No. of columns in ith row?? --> N
//			what to print?? --> _ & *
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of rows for the square pattern : ");
			int N = scan.nextInt();
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N - i + 1; j++) {
					System.out.print("*");
				}
//				for(int j = 1; j <= N; j++) {
//					System.out.print(" ");
//				}
				System.out.println();
			}
			 
		}
}
