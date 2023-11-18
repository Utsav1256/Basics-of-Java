package Searching_And_Sorting;
import java.util.Scanner;
public class Binary_search {
	
	/*
	 	Coding Problem
Problem Name: Binary Search
Problem Level: EASY
Problem Description: 
#### You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.

##### Input format : 
    The first line contains an Integer 'N' which denotes the size of the array/list.

    Second line contains 'N' single space separated integers representing the elements in the array/list.

    Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..

    All the 't' lines henceforth, will take the value of X to be searched for in the array/list.

##### Output Format : 
    For each test case, print the index at which X is present, -1 otherwise.

    Output for every test case will be printed in a separate line.

##### Constraints :
    1 <= t <= 10^4
    0 <= N <= 10^6
    0 <= X <= 10^9
    Time Limit: 1 sec
 ##### Sample Input 1:
    7
    1 3 7 9 11 12 45
    1
    3

##### Sample Output 1:
    1

##### Sample Input 2:
    7
    1 2 3 4 5 6 7
    2
    9
    7

##### Sample Output 2:
    -1
    6
	*/
	
	public static int[] putValues(int arr[]) {
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		return arr;
	}
	
	
	public static void BinarySearch(int arr[], int X) {
		int startIndex = 0;
		int endIndex = arr.length - 1;
		
		int indexFound = -2;
		
		for(int j = 0; j < arr.length; j++) {
			
			if(startIndex > endIndex) {
				indexFound = -1;
				break;
			}
			
			int midIndex = (startIndex + endIndex) / 2;
			
			if(X == arr[midIndex]) {
				indexFound = midIndex;
				break;
			}
			if(X < arr[midIndex]) {
//				go to left of midIndex
				endIndex = midIndex - 1;
			}
			if(X > arr[midIndex]) {
//				go to right of the midIndex
				startIndex =  midIndex + 1;
			}
			
		}
		
		System.out.println(indexFound);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
			int size = scan.nextInt();
			int arr[] = new int[size];
			
			arr = putValues(arr);
			
			int X = scan.nextInt();
			
			BinarySearch(arr, X);
					
		}

	}
	
//	solved

}
