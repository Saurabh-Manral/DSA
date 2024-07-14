package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearch {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		System.out.println("Enter the element for search: ");
		int ele = Integer.parseInt(bufferedReader.readLine());
		
		int index = linearSearchOptimal(arr, ele);
		if(index == -1)
			System.out.println("Element is not present.");
		else
			System.out.println("Element is present at index: " + index);
		
	}
	
	//This is optimal approach with TC: O(n) and SC: O(1)
	public static int linearSearchOptimal(int[] arr, int ele) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}

}
