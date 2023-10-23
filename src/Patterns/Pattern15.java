package Patterns;

import java.util.Scanner;

public class Pattern15 {
public static void main(String[] args) {
	
//Problem Name: Mirror Number Pattern
//Problem Level: EASY
//Problem Description: #### Print the following pattern for the given N number of rows. 

		/*
	 	      1 
	         12
	        123
	       1234
		*/
			
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of rows for the square pattern : ");
			int N = scan.nextInt();
		
			
			for(int i = 1; i <= N; i++) {
				int inc = 1;
				for(int j = 1; j  <= N - i; j++) {
					System.out.print(" ");
				}
				for(int j = N - i + 1; j  <= N; j++) {
					System.out.print(inc);
					inc++;
				}
				System.out.println();
			}
		} 
}
