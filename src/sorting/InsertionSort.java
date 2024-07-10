package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertionSort {

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

		insertionSort(element, element.length);
		
		for(int ele : element) {
			System.out.print(ele + " ");
		}
	}
	//insertion sort
	public static void insertionSort(int[] arr, int size) {
		
		for(int i = 1; i < size; i++) {
			int j = i;
			while(j > 0 && arr[j] < arr[j - 1]) {
				//swapping element
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
				//moving j to left
				j--;
			}
		}
	}

}
