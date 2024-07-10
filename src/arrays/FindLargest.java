package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindLargest {

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
		//System.out.println("The largest elemnt is: " + findLargestElementBrute(arr, size));
		
		//optimal approach call
		//System.out.println("The largest element is: " + findLargestElementOptimal(arr, size));

	}
	
	//this is brute force approach of the problem with time complexity of O(n^2)
	public static int findLargestElementBrute(int[] arr, int size) {
		if(size == 1)
			return arr[0];
		
		Arrays.sort(arr);
		return arr[size - 1];
	}
	
	//this is optimal approach of the problem with time complexity of O(n)
	public static int findLargestElementOptimal(int[] arr, int size) {
		int largest = arr[0];
		
		for(int i = 1; i < size; i++) {
			if(arr[i] > largest)
				largest = arr[i];
		}
		
		return largest;
	}

}
