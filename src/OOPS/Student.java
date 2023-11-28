package OOPS;

public class Student {
	public String name;
	private int rollNo;
	
	 public void setRollNo(int rN) {
		 if(rN <= 0) {
			 return;
		 }
		 rollNo = rN;
	 }
	 
	 public int getRollNo() {
		 return rollNo;
	 }
}
// Access Modifiers :
// default -> properties are accessible within the same package.
// public  -> properties are accessible anywhere
// private -> properties are accessible within the same class