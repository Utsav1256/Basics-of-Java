package Patterns;
import java.util.Scanner;
public class Pattern5 {
	public static void main(String[]args) {
		
		/*
		 1
		 12
		 123
		 1234
		*/
		/*
		no.of rows ?? --> N = 4
		no. of columns?? --> here, no. of columns is depending upon row no. 
						 --> no. of column in ith row = i
		what to print?? --> 
					       here, content of each row is not same 
					       content of each column is different --> it depends upon column
       --> column no. -> j (in reverse order)
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the tringular pattern : ");
		int N = scan.nextInt();
		
		for(int i =1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}
}
