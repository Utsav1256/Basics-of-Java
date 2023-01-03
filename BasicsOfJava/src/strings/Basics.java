package strings;

public class Basics {

	public static void main(String[] args) {
		
		// How we create a character
		char c = 'c';
		// How we create a string
		String str = "abcdefg"; //this is stored in array as: |a|b|c|d|e|f|g|h|
															// in character format
		System.out.println(str);
		
		//	Function To read characters of the String : str.charAt()
			//	if i want to read character at index 1 in a String
			System.out.println(str.charAt(1));
			//System.out.println(str[1]);//incorrect way of accessing it
		
		
		//	Function to figure out length of the String : str.length()
			System.out.println(str.length());
		
			
		//	Function to find subString : substring(beginIndex, endIndex)
			System.out.println(str.substring(1, 6)); //it does not include the character at endIndex :)
			System.out.println(str.substring(0, 1));
			
			//	subSequence(beginIndex)
			System.out.println(str.substring(3));
			System.out.println(str.substring(0));
			
			String temp = str.substring(str.length()); // we are providing length of the String
			System.out.println(temp); //obviously, there will be no character which will start from the length of the String
			System.out.println(temp.length()); //Hence, the temp variable will have no string, So the length will be 0 :)
			
			System.out.println(str.substring(1, 1));//b/w index 1 and index1 there is no String, So it will be null.
			
			
		//	Function to find out if the String contains a given sequence or not : str.contains()
			System.out.println(str.contains("cde")); //cde is a part of the String 
			System.out.println(str.contains("cdf")); // But cdf is not the part of the String :)
			
			
			
			
	}

}
