package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftRotateByOnePlace {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		//shifting array to left by one place
		leftShiftArrayByOnePlace(arr, size);
		
		System.out.println("Array after shifting is: ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}

	}
	
	//left shift an array by one place
	public static void leftShiftArrayByOnePlace(int[] arr, int size) {
		
		int becomingLast = arr[0];
		
		for(int i = 1; i < size; i++) {
			arr[i - 1] = arr[i];
		}
		arr[size - 1] = becomingLast;
	}

}
