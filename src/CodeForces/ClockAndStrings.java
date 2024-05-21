package CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class ClockAndStrings {
	
	private static boolean doTheyIntersect(int a, int b, int c, int d) {
		if(a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if(c > d) {
			int temp = c;
			c = d;
			d = temp;
		}
		
		return (a < c && b > c && b < d) || (c < a && d > a && d < b);
	}

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		scan.nextLine();
		
		int i = 0;
		while(i < t) {
			int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            
            if(doTheyIntersect(a, b, c, d)) {
            	System.out.println("YES");
            } else {
            	System.out.println("NO");
            }
			i++;
		}
		scan.close();
	}

}
