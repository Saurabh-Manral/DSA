package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

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

		bubbleSort(element, size);
		
		for(int e : element) {
			System.out.print(e + " ");
		}
		
	}
	
	
	public static void bubbleSort(int[] arr, int size) {
		
		for(int i = 0; i < size - 1; i++) {
			for(int j = 0; j < size - i - 1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
