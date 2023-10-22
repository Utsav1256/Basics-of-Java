package Patterns;

import java.util.Scanner;

public class Pattern13 {
public static void main(String[] args) {
		

		/*
	 	   ****
		    ***
		     **
		      *
		*/
			
	
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter number of rows for the square pattern : ");
			int N = scan.nextInt();
		
			for(int i =1; i <= N; i++) {
				int inc= 1;
				int dec = i - 1;
				for(int j = 1; j <= N-i; j++) {
					System.out.print(" ");
				}
				for(int j = N - i + 1; j <= N; j++) {
					System.out.print(inc);
					inc++;
				}
				for(int j = N + 1; j <= i + N - 1; j++) {
					System.out.print(dec);
					dec--;
				} 
				System.out.println();
			}
		}
}
