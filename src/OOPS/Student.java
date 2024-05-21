package OOPS;

public class Student {
	public String name;
//	final data members can be initialized only, as soon as they are declared or inside constructor
	private final int rollNo; 
//	any data member which is final, cannot be changed once it is initialized
	
	static int numStudents;


	public Student(String name, int rollNo) {
		System.out.println("this -> " + this); //this -> OOPS.Student@238e0d81 -> reference of the student
		this.name = name;
		this.rollNo = rollNo;
		System.out.println("this.name -> " + this.name); //this.name -> Utsav
	}
//	 public void setRollNo(int rN) {
//		 if(rN <= 0) {
//			 return;
//		 }
//		 rollNo = rN;
//	 }
//	 
	 public int getRollNo() {
		 return rollNo;
	 }
	 
	 public void print() {
		 System.out.println(name + ", " + rollNo );
	 }
}
// Access Modifiers :
// default -> properties are accessible within the same package.
// public  -> properties are accessible anywhere
// private -> properties are accessible within the same class