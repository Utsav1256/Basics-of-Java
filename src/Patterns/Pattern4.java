package Patterns;
import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		/*
		 4321
		 4321
		 4321
		 4321
		*/
		/*
		no.of rows ?? --> N = 4
		no. of columns?? --> = N
		what to print?? --> 
        yaha content of each row is same --> it does not depends upon row
        content of each column is different --> it depends upon column
        --> column no. -> j (in reverse order)
		*/
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Enter number of rows for the square pattern : ");
				int N = scan.nextInt();
				
				for(int i = 1; i <= N; i++) {
					for(int j = N; j > 0; j--) {
						System.out.print(j);
					}
					System.out.println();
				}
//				for(int i = 1; i <= N; i++) {
//					for(int j = 1; j <= N; j++) {
//						System.out.print(N - j + 1);
//					}
//					System.out.println();
//				}
			}
	
}
