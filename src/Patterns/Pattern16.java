package Patterns;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {

//		Problem Name: Inverted Number Pattern
//		Problem Level: EASY
//		Problem Description: #### Print the following pattern for the given N number of rows. 
//		##### Pattern for N = 4

//			4444
//			333
//			22
//			1
					
			
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter number of rows for the square pattern : ");
					int N = scan.nextInt();
				
					
					for(int i = 1; i <= N; i++) {
						for(int j = 1; j <= N - i + 1; j++) {
							System.out.print(N - i + 1);
						}
						System.out.println();
					}
				} 
}
