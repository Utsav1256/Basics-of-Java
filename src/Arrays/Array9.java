 package Arrays;

import java.util.Scanner;

public class Array9 {
/*
 Coding Problem
Problem Name: Arrange Numbers in the Array
Problem Level: EASY
Problem Description: #### You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array. 
#### Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,.......4,2. 

##### Note: 
    You need not print the array. You only need to populate it.


##### Input Format :
    The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

    The first and the only line of each test case or query contains an integer 'N'.

##### Output Format :
    For each test case, print the elements of the array/list separated by a single space.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^2
    0 <= N <= 10^4

    Time Limit: 1sec
 ##### Sample Input 1 : 
    1 
    6
##### Sample Output 1 :
    1 3 5 6 4 2

##### Sample Input 2 : 
    2
    9
    3
##### Sample Output 2 :
    1 3 5 7 9 8 6 4 2
    1 3 2 
 */
	
public static int[] createArray() {
		
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		
		int arr[] = new int[N];

		int oddCount = N - (N/2);
		for(int j = 0; j < oddCount; j++) {
			arr[j] = (2 * j + 1);	
		}
		int j = 1;
		for(int  k = N - 1; k > oddCount - 1; k--) {
			arr[k] = (2 * j);
			j++;
		}
		
		
		return arr;
	} 
	
	
public static int[] createArray2() {
	Scanner scan = new Scanner(System.in);
	int size = scan.nextInt();
	int arr[] = new int[size];
	int start = 0;
	int end = size - 1;
	int val = 1;
	while(start <= end) {
		if(val % 2 == 1) {
			arr[start] = val;
			val++;
			start++;
		}
		else {
			arr[end] = val;
			val++;
			end--;
		}
	}
	return arr;
}
	public static void print(int index[]) {
			for(int i = 0; i < index.length; i++) {
				System.out.print(index[i]);
			}
	}
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
        for(int i = 1; i <= t; i++) {
//        	int arr[] = createArray();
        	int arr[] = createArray2();
        	print(arr);
        	
		}
		
		
	}
//	solved
}
