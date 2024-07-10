package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelectionSort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		//creating array
		int[] element = new int[size];
		//taking elements as user input
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			element[i] = Integer.parseInt(bufferedReader.readLine());
		}

		selectionSort(element);
		
		for(int ele : element)
			System.out.print(ele + " ");
		
	}
	
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[i] > arr[j])
					min = j;
			}
			//swapping
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

}
