package Patterns;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
/*
 1111
 2222
 3333
 4444
*/
		/*
		no.of rows ?? --> N = 4
		no. of columns?? --> = N
		what to print?? --> row no. -> i
		*/	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows for the square pattern : ");
		int N = scan.nextInt();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
