package OOPS;

public class Student {
	public String name;
//	final data members can be initialized only, as soon as they are declared or inside constructor
	private final int rollNo; 
//	any data member which is final, cannot be changed once it is initialized
	
//	default constructor
//	public Student() {
//		rollNo = 12;
//	}
	
//	Parameterized constructor
	
//	public Student(String n) {
//		name = n;
//		
//	}
	public Student(String n, int rN) {
		name = n;
		rollNo = rN;
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