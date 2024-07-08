package Strings;
/*
 For a given string you have to find out all of its substrings.

For example :
1.
	code
		c co cod code
		o od ode
		d de
		e
 */
public class Print_all_substrings {

	public static void substringPrinter(String str) {
		for(int startIndex = 0; startIndex < str.length(); startIndex++) {
			for(int endIndex = startIndex + 1; endIndex <= str.length(); endIndex++) {
				System.out.print(str.substring(startIndex, endIndex) + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		String str = "code";
		
		substringPrinter(str);
	}

}
