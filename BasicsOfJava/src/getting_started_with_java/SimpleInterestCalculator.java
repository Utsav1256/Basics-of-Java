package getting_started_with_java;

public class SimpleInterestCalculator {

	public static void main(String[] args) {
		
		int principle = 1000;
		int rate = 5;
		int time = 2;
		int simpleInterest = (principle * rate * time)/100;
		
		System.out.println(simpleInterest);

	}

}
