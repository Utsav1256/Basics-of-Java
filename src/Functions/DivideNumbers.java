package Functions;
// write a funtion to divide two functions and return the result
import java.util.Scanner;
public class DivideNumbers {
	
	public static int divideNumbers(int num, int denum) {
		if(denum == 0) {
			System.out.println("Division by Zero is not allowed");
			return Integer.MIN_VALUE;
		}
		return (num / denum);
	}
	public static void printDivisionResult(int num, int denum) {
		if(denum == 0) {
			System.out.println("Division by Zero is not allowed");
			return;
		}
		System.out.println(num / denum);
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int result = divideNumbers(a, b);
		System.out.println(result);
		
	}
}
