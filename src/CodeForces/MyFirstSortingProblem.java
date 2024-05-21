package CodeForces;
import java.util.Scanner;
public class MyFirstSortingProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int t = scan.nextInt();
		
		
		int i = 0;
		while(i < t) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			if(x <= y ) {
				System.out.println(x + " " + y);
			} else {
				System.out.println(y + " " + x);
			}
			i++;
		}

	}

}
