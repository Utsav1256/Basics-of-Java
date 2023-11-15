package Arrays;

public class Array6 {

	public static void increment(int i) { // value is copied
		i++;
	}
	
	public static void incrementArray(int inp[]) { // address is copied
		for( int i = 0 ; i < inp.length; i++) {
			inp[i]++;
		}
	}
	
	public static void print(int input[]) { 
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");	
		}
	}
	
	public static void main(String[] args) {
		
		int i = 1;
		
		int arr[] = {1, 2, 3, 4, 5};
		System.out.println(arr);
		incrementArray(arr);
		System.out.println(i);
		print(arr);
		
	}

//	arr and inp is refering to the same array

} 
