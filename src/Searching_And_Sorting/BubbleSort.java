package Searching_And_Sorting;

public class BubbleSort {

	
	public static void main(String[] args) {
		int arr[] = {8,26,1,5,6};
		
		for(int i = 0; i<arr.length - 1; i++) {
//			System.out.print(i);
			for(int j = 0; j<arr.length - i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		for(int i =0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
