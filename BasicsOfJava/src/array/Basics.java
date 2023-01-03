package array;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12;
		int arr[] = new int[n];
		arr[1] = 15;
		System.out.println(arr[1]);
		System.out.println(arr[0]); // default value is 0 (for integers)
		
		char chArray[] = new char[n];
		chArray[5] = 'a'; //"" -> dauble-quatation is used for string, not fore characters. 
		                  //'' -> single-quatation is used for characters
		System.out.println(chArray[5]);
		System.out.println(chArray[6]); // default value is null (for characters)
		chArray[6] = '!';
		System.out.println(chArray[6]);
		
		
	}

}
