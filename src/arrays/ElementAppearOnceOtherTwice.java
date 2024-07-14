package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElementAppearOnceOtherTwice {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		//Calling brute force approach
		//System.out.println("Element that appears once is: " + findElementAppearOnceBrute(arr, size));
		
		//Calling optimal approach
		System.out.println("Element that appears once is: " + findElementAppearOnceOptimal(arr, size));
		
	}
	
	//This is brute force approach with TC: O(n^2) and SC: O(1)
	public static int findElementAppearOnceBrute(int[] arr, int size) {
		
		for(int i = 0; i < size; i++) {
			int count = 0;
			for(int j = 0; j < size; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}	
			}
			
			if(count == 1)
				return arr[i];
		}
		
		return -1;
	}
	
	//This is optimal approach with TC: O(n) and SC: O(n)
	public static int findElementAppearOnceOptimal(int[] arr, int size) {
		
		int ele = 0;
		
		for(int i = 0; i < size; i++) {
			 ele ^= arr[i];
		}
		
		return ele;
	}

}
