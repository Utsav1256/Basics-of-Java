package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		/*
		 1234
		 1234
		 1234
		 1234
		*/
				/*
				no.of rows ?? --> N = 4
				no. of columns?? --> = N
				what to print?? --> 
                har ek row me content same hai --> ye row pe to depend nahi kar raha
                but, har ek column me content different hai --> ye column pe depend kar raha hai
                --> column no. -> j
                */	
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Enter number of rows for the square pattern : ");
				int N = scan.nextInt();
				
				for(int i = 1; i <= N; i++) {
					for(int j = 1; j <= N; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
			}

}
