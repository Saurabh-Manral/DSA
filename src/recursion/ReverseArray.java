package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = -1;
		try {
			size = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			try {
				arr[i] = Integer.parseInt(bufferedReader.readLine());
			} catch(IOException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		//reversing the array 
		reverseArray(arr, 0);
		
		//printing reversed array
		for(int ele : arr)
			System.out.print(ele + " ");

	}
	
	//Reversing and array using single pointer
	public static void reverseArray(int[] arr, int curr) {
		//base case
		if(curr >= (arr.length / 2))
			return;
		
		
		swap(arr, curr);
		
		//recursive call
		reverseArray(arr, curr + 1);
	}
	
	public static void swap(int[] arr, int curr) {
		int r = arr.length - curr - 1;
		arr[curr] += arr[r];
		arr[r] = arr[curr] - arr[r];
		arr[curr] -= arr[r];
	}

}
