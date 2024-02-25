package Functions;
//Everything in Java is pass-by-value 😃
public class PassByValue {
	public static void c(int n) {
		System.out.println(n);
	}
	public static void b(int n) {
		c(n);
		System.out.println(n);
		n++;
	}
	public static void a(int n) {
	b(n);
	System.out.println(n);
	n++;
	
	}
	public static void main(String[] args) {
		int n = 10;
		a(n);
		System.out.println(n);
	}

}
