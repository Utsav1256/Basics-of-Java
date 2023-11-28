package OOPS;

public class Student {
	public String name;
	private int rollNo;
	
//	default constructor
//	public Student() {
//		rollNo = 12;
//	}
	
//	Parameterized constructor
	
	public Student(String n) {
		name = n;
	}
	public Student(String n, int rN) {
		name = n;
		rollNo = rN;
	}
	 public void setRollNo(int rN) {
		 if(rN <= 0) {
			 return;
		 }
		 rollNo = rN;
	 }
	 
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