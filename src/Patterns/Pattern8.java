package Patterns;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		
//		Character pattern
		/*
		 ABCD
		 ABCD
		 ABCD
		 ABCD
		*/
		/*
		no.of rows ?? --> N = 4
		no. of columns??  --> no. of column in ith row = N
		what to print?? --> 
					       here, content of each row is same --> so it does not depends upon row
					       content of each column is different --> it depends upon column
    --> column no. -> j (in reverse order)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the square character pattern : ");
		int N = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				//System.out.print('A'+j-1);// --> it will print integer(ascii values)
				System.out.print((char)('A' + j - 1));// --> we have to explicitly type-cast it
				
			}
			System.out.println();
		}
	}

}
