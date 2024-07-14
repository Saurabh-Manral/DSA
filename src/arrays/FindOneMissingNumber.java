package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOneMissingNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
			
		}
		
		//calling brute force approach
		//System.out.println("The missing element is: " + findMissingOneBrute(arr, size));
		
		//calling better approach
		//System.out.println("The missing element is: " + findMissingOneBetter(arr, size));
		
		//calling optimal approach
		//System.out.println("The missing element is: " + findMissingOneOptimal(arr, size));
		
		//calling slightly more optimal approach
		//System.out.println("The missing element is: " + findMissingOneOptimal2(arr, size) );

	}
	
	//This is brute force approach with TC: O(n^2) and SC: O(1)
	public static int findMissingOneBrute(int[] arr, int size) {
		
		for(int i = 1; i <= size + 1; i++) {
			boolean exist = false;
			for(int j = 0; j < size; j++) {
				if(i == arr[j]) {
					exist = true;
					break;
				}
			}
			if(!exist)
				return i;
			
		}
		return -1;
	}
	
	//This is better approach for finding missing element with TC: O(n) and SC: O(n + 2)
	public static int findMissingOneBetter(int[] arr, int size) {
		
		int[] count = new int[size + 2];
		
		//count the present of array
		for(int i = 0; i < size; i++) {
			count[arr[i]]++;
		}
		
		for(int i = 1; i < count.length; i++) {
			if(count[i] == 0)
				return i;
		}
		
		return -1;
	}
	
	//This is optimal approach for finding missing element with TC: O(n) and SC: O(1)
	public static int findMissingOneOptimal(int[] arr, int size) {
		int sum = ((size + 1) * (size + 2))/2;
		
		for(int ele : arr)
			sum -= ele;
		
		return sum;
	}
	
	//This is slightly more optimal approach for finding missing element with TC: O(n) and SC: O(1)
	public static int findMissingOneOptimal2(int[] arr, int size) {
		int firstXOR = 0, secondXOR = 0;
		for(int i = 1; i <= size + 1; i++)
			firstXOR ^= i;
		
		for(int ele: arr)
			secondXOR ^= ele;
		
		return firstXOR ^ secondXOR;
	}

}
