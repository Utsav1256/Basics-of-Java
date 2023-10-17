package Patterns;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		

	/*
	 	****
		****
		****
		****
	*/
		
//		No. of rows?? --> N = 4
//		No. of columns in ith row?? --> N
//		what to print?? --> *
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows for the square pattern : ");
		int N = scan.nextInt();
		
//		int i = 1;
//		while(i <= N) {
//			int j  = 1;
//			while(j <= N) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//		using for loop
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
