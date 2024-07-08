package Strings;

/*
 - if the character at the even index, for current character you have to put the next character, in the same format (uppercase / lowercase).
- if the character at the odd index, for current character you have to put the previous character, in the same format (uppercase / lowercase).

For example:
1.
	"cdEfG" --> "dcFeH"
2.
	"dd" --> "ec"
 */
public class Replace_Ascii {
	
	public static String ascii_replacer(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		for(int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if(i % 2 == 0) {
				ch = (char)(ch+ 1);
			} else {
				ch = (char)(ch - 1);
			}
			sb.setCharAt(i, ch);
		}
		str = sb.toString();
		
		return str;
	}
	
	public static void main(String[] args) {
		String str = "cdEfG";
		String str1 = "dd";
		
		String result = ascii_replacer(str);
		String result1 = ascii_replacer(str1);
		
		System.out.println(str + " -> " + result);
		System.out.println(str1 + " -> " + result1);

	}

}
