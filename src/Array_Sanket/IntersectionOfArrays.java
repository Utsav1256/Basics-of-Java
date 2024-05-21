package Array_Sanket;
//Intersection of Arrays
//arr1->[10, 20, 30, 40, 40, 40, 50]
//arr2->[15, 16, 17, 18, 20, 25, 30, 30, 40]
//o/p: [20, 30, 40]
import java.util.ArrayList;
public class IntersectionOfArrays {
	public static ArrayList<Integer> intersectionOfArrs(int[] A, int[] B) {
		ArrayList<Integer> result = new ArrayList<>();
//		int temp = 0;
//		for(int i = 0; i < A.length; i++) {
//			for(int j = temp; j < B.length; j++) {
//				if(A[i] == B[j]) {
//					result.add(B[j]);
//					temp = j + 1;
//					break;
//				}
//			}
//		}
		int i = 0, j = 0;
		while(i < A.length && j < B.length) {
			if(A[i] < B[j]) {
				i++;
			} 
			else if(A[i] > B[j]) {
				j++;
			}
			else {
				result.add(A[i]);
				i++;
				j++;
			}
		}//time complexity of O(n + m), where n and m are the lengths of the two arrays,
		//making it much more efficient than the nested loop approach of the first method,
		//which has a time complexity of O(n*m).
		return result;
	}
	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 40, 40, 50};
		int[] arr2 = {15, 16, 17, 18, 20, 25, 30, 30, 40};
		
		ArrayList<Integer> result = intersectionOfArrs(arr1, arr2);	
		System.out.println(result);
	}

}
