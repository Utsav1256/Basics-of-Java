  package OOPS;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//since Scanner class is not in this package thats why we have to write import
//		within the same package we don't have to write import
		Student s1 = new Student();
		Student s2 = new Student();
		//new Student() --> this will create new object for you
//		and we get its address
//		and we store it in s1
		
//		Student s2 = new Student();
//		so this line is creating two memory spaces, one where you are getting the actual student
//		another memory space is s2 , which is actually going to store the address of the student
		
		System.out.println(s2); // OOPS.Student@238e0d81  // address of the student
		
		s1.name = "Utsav";
		s1.rollNo = 27;
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
//		Utsav
//		27
//		null
//		0

		
	}

}
