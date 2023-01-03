package strings;

public class Basics {

	public static void printChar(String s) {
		for(int i = 0; i < s.length(); i++) {//length -1 => i < s.length()
			System.out.println(s.charAt(i));
		}
	}
	
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
			
			
		//  Q: Print all characters of the String in different lines.
			
			printChar(str);
			
//			How Strings are stored??
			
			str = "abc"; //Now, the str variable is pointing to the other String
			System.out.println(str);
			
			//	Strings are immutable	[concept of String pool]
			// s.setcharAt(1) = 'f'; thats why this is wrong :)
			
			
			//	concatenate two Strings :
			str = str + "def";
			System.out.println(str);
			str = "ghi" + str;
			System.out.println(str);
			// there is a fn. also for this : concat()
			System.out.println(str.concat("jkl")); // this fn. returns new String after concatenation, does not do any changes on the string on which it is applied :)
			System.out.println(str);
			
//			Comparing two Arrays :
				int arr1[] = {1, 2, 3};
				int arr2[] = {1, 2, 3};
				
				if(arr1 == arr2) { // it is comparing addresses
					System.out.println("equal");
				}
				else {
					System.out.println("unequal");
				}
				// in case of Non-primitives '==' compares references 
				System.out.println(arr1);
				System.out.println(arr2);
			
			
//			Let's compare in case of Strings :
				String str1 = "abc";
				String str2 = "abc";
				
				if(str1 == str2) {
					System.out.println("equal");
				}else {
					System.out.println("unequal");
				}
				// Here, both the variables are referring to the same String [concept of String pool] :)
				
//			In the case of Non-primitives, if you want to compare content,
//				then we can use the fn. str1.equals(str2)
			System.out.println(arr1.equals(arr2));
			System.out.println(str1.equals(str2));
			
			if(arr1.equals(arr2)) { // it is comparing addresses
				System.out.println("equal");
			}
			else {
				System.out.println("unequal");
			}// why this is giving unequal???
			
			
			if(str1.equals(str2)) {
				System.out.println("equal");
			}else {
				System.out.println("unequal");
			}
			
			
	}

}
