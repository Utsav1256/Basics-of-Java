package Patterns;

import java.util.Scanner;

public class Pattern15 {
public static void main(String[] args) {
		

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
