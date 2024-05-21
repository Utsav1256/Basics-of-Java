package CodeForces;

import java.util.Scanner;
import java.util.Arrays;

public class DifferentString {
	
	private static boolean areCharactersSame(String s) {
		char first = s.charAt(0);
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != first) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		scan.nextLine();
		
		int i = 0;
		while(i < t) {
			String s = scan.nextLine();
			
			if(s.length() <= 1 || areCharactersSame(s)) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				char[] chars = s.toCharArray();
				Arrays.sort(chars);
				String sorted = new String(chars);
				if(sorted.equals(s)) {
					System.out.println(new StringBuilder(sorted).reverse().toString());
				} else {
					System.out.println(sorted);
				}
				
			}
			i++;
		}
		scan.close();


	}

}
