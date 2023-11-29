  package OOPS;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//since Scanner class is not in this package thats why we have to write import
//		within the same package we don't have to write import
		Student s1 = new Student("Utsav", 32);

		s1.print();
		System.out.println(s1);
		
 
	
//in java whenever we make a new class, we  get a function for free, that is called constructor.
	}

}
