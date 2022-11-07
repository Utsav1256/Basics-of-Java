package getting_started_with_java;

import java.util.Scanner;

public class Add2Num {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		int i = scan.nextInt();
//		int j = scan.nextInt();
//		
//		int sum = i + j;
//		System.out.println(sum);
//		
		
		
//		i = 17;
//		sum = i + j;
//		System.out.println(sum);
//		
//		short k = 123;
//		
//		long l = 12345;
//		
//		double d = scan.nextDouble();
//		System.out.println(d);	
//		
//		float m = scan.nextFloat();
//		System.out.println(m);
//		
		
//		char c = 'a';
		
		
//		String str = "abcd";
//		System.out.println(str);
//		
//		Taking string as input
		String str1 = scan.nextLine(); //input- abc def ghi 
		System.out.println(str1);      //output- abc def ghi
		
		String str2 = scan.next(); //input- abc def ghi
		System.out.println(str2);  //output- abc 
//		 it will give it to the next line
		
		char c = str2.charAt(0);
		System.out.println(c);
		
		char c1 = str2.charAt(2);
		System.out.println(c1);
		
//		boolean b = true;
//		boolean z = false;
		
        
		
	}

}
