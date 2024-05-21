package Array_Sanket;

import java.util.ArrayList;

// 1. arr1 -> [5 6 7]
//    arr2 -> [3 4 4 2]
//	  o/p ->  [4 0 0 9]

//2. arr1 -> [9 9]
//   arr2 -> [9 9 9]
//   o/p ->  [1 0 8 9]

//3. arr1 -> [5 6 7]
//   arr2 -> [3 4 4 6]
//   o/p ->  [4 0 1 3]
public class AddTwoArrays {

	public static ArrayList<Integer> addTwoArrs(int[] A, int[] B) {
		ArrayList<Integer> result = new ArrayList<>();
		int i = A.length - 1;
		int j = B.length - 1;
		int carry = 0;

		while(i >= 0 || j >= 0) {
//			if(i >= 0 && j >= 0) {
//				int sum = A[i] + B[j] +carry;
//				result.add(0, sum % 10);
//				carry = sum / 10;
//				i--;
//				j--;
//				
//			}else if(i < 0) {
//				int sum = B[j] +carry;
//				result.add(0, sum % 10);
//				carry = sum / 10;
//				i--;
//				j--;
//			}else if(j < 0) {
//				int sum = A[i] +carry;
//				result.add(0, sum % 10);
//				carry = sum / 10;
//				i--;
//				j--;
//			}
			int sum = 0;
			if(i >= 0) {
				sum += A[i];
			}
			if(j >= 0) {
				sum += B[j];
			}
			sum += carry;
			result.add(0, sum % 10);
			carry = sum / 10;
			
			i--;
			j--;
			
		} 
		if(carry > 0) {
			result.add(0, carry);
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {5, 6, 7};
		int[] arr2 = {3, 4, 4, 6};
		
		ArrayList<Integer> result = addTwoArrs(arr1, arr2);	
		System.out.println(result);
	}

}
