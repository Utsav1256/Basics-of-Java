package getting_started_with_java;

import java.util.Scanner;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int principle = scan.nextInt();
		int rate = scan.nextInt();
		int time = scan.nextInt();
		int simpleInterest = (principle * rate * time)/100;
		
		System.out.println(simpleInterest);

	}

}
