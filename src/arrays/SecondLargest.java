package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		//brute force approach call
		//System.out.println("The second largest element is: " + secondLargestElementBrute(arr, size));
		
		//better approach call
		//System.out.println("The second largest element is: " + secondLargestElementBetter(arr, size));
		
		//optimal approach call
		//System.out.println("The second largest element is: " + secondLargestElementOptimal(arr, size));
	}
	
	//This is brute force approach of problem where time complexity is O(n + n^2)
	public static int secondLargestElementBrute(int[] arr, int size) {
		
		Arrays.sort(arr);
		int largest = arr[size - 1];
		
		for(int i = size - 2; i >= 0; i--) {
			if(arr[i] != largest)
				return arr[i];
		}
		
		return -1;
	}
	
	//This is better approach of problem with time complexity of O(2n)
	public static int secondLargestElementBetter(int[] arr, int size) {
		int largest = arr[0];
		
		//finding the largest element
		for(int i = 1; i < size; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		
		int secondLargest = -1;
		for(int i = 0; i < size; i++) {
			if(arr[i] < largest && arr[i] > secondLargest)
				secondLargest = arr[i];
		}
		return secondLargest;
	}
	
	//This is optimal approach of problem with time complexity of O(n)
	public static int secondLargestElementOptimal(int[] arr, int size) {
		int largest = arr[0];
		int smallest = -1;
		
		for(int i = 1; i < size; i++) {
			if(arr[i] > largest) {
				smallest = largest;
				largest = arr[i];
			} else if(arr[i] < largest) {
				if(arr[i] > smallest)
					smallest = arr[i];
			} else {
				//if equal do nothing
			}
		}
		
		return smallest;
	}

}
