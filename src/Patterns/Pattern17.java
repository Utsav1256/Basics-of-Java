package Patterns;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {

//		Problem Name: Star Pattern
//		Problem Level: EASY
//		Problem Description: #### Print the following pattern
//		##### Pattern for N = 4
//		
//        *
//       *** 
//      *****
//     *******
					
			
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter number of rows for the square pattern : ");
					int N = scan.nextInt();
				
					
					for(int i = 1; i <= N; i++) {
						 for(int j = 1; j <= N - i; j++) {
							 System.out.print(" ");
						 }
						 for(int j = N - i + 1; j <= N; j++) {
							 System.out.print("*");
						 }
						 for(int j = N + 1; j <= N + i - 1; j++) {
							 System.out.print("*");
						 }
						System.out.println();
					}
				} 
}
