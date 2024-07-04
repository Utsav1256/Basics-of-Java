package Strings;

//Given a string, check if its a palindrome or not.
//Example:
//1.
//i/p: "riya" 
//-> "riya" --> "ayir"
//o/p: false
//
//2.
//i/p: "naman"
//-> "naman" --> "naman"
//o/p: true


public class PalindromeOrNot {
	
	public static boolean checkPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		
		while(i < j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "naman";
		String str1 = "riya";
		
		boolean result = checkPalindrome(str);
		boolean result1 = checkPalindrome(str1);
		System.out.println(str + " -> " + result);
		System.out.println(str1 + " -> " + result1);
	}

}
