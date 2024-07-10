package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsSorted {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		System.out.println("Is array is sorted? : " + isSorted(arr, size) );
		
	}
	
	//This is optimal with time complexity of O(n)
	public static boolean isSorted(int[] arr, int size) {
		for(int i = 1; i < size; i++) {
			if(arr[i] >= arr[i - 1]) {
				
			} else
				return false;	
		}
		return true;
	}

}
