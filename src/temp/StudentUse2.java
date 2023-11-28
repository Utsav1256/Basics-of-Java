package temp;
import OOPS.Student; // have to use import bcz. Student class is in the different package
public class StudentUse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println("Address of the student in s : " + s);
//		Address of the student in s : OOPS.Student@133314b
		
		s.name = "Utsav";
		s.setRollNo(24);
		
		System.out.println(s.name);
		System.out.println(s.getRollNo());
// bcz. when setRollNo() and getRollNo() are public => can be accessed from anywhere
//		Utsav
//		24
	}

}
