package Functions;

// nCr = n! / (r!(n-r)!)
import java.util.Scanner;
public class Find_nCr {
	static int factorial(int num) {
		int ans = 1;
		for(int i = 2; i <= num; i++) {
			ans = ans * i;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		if(n>=r && r>=0) {
			int nCr = factorial(n) / (factorial(r) * factorial(n-r));
			System.out.println(nCr);
		}
		else {
			System.out.println("please enter the values as: n>=r>=0");
		}
		
//		without using function 😀
//		using only one loop
//		int factn = 1, factr = 1, factnr = 1;
//		
//		for(int i = 2; i <= n; i++) {
//			factn*=i;
//			if(i<=r)
//				factr*=i;
//			if(i<=(n-r))
//				factnr*=i;
//		}
//		int nCr = factn / (factr * factnr);
//		System.out.println(nCr);
	}

}
