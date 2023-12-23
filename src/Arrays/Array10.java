package Arrays;
import java.util.Scanner;
public class Array10 {
//	PrintAllPairs
	
	public static int[] createArray() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		return arr;
	}
	public static void printAllPairs(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
//				System.out.print(", ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i = 0; i<t;i++) {
		int arr[]= createArray();
		printAllPairs(arr);
		}
	}
			
			

}
