package array;
import java.util.Scanner;
public class Basics {

	public static void main(String[] args) {
		
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
		
		double dArray[] = new double[n];
		dArray[1] = 5.5;
		System.out.println(dArray[1]);
		System.out.println(dArray[7]);// default value is 0.0 (for decimal)
		dArray[7] = 6;
		System.out.println(dArray[7]);
		
		// taking input of the array from user
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		
		int arr1[] = new int[s];
		arr1[s-1] = 5;
		System.out.println(arr1[s-1] + " is at position " + ((s-1)+1));
		
		char chArray1[] = new char[s];
		chArray[0] = 'z';
		System.out.println(chArray[0]);
		
		double dArray1[] = new double[s];
		dArray[4] = 5.5;
		System.out.println(dArray[4]);
		
		boolean bArray[] = new boolean[s];
		bArray[3] = true;
		bArray[5] = false;
		System.out.println(bArray[3]);
		System.out.println(bArray[4]); // default value is false (for boolean)
		System.out.println(bArray[5]);
		
		
	}

}
