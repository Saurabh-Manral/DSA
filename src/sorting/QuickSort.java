package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuickSort {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		quickSort(arr, 0, size - 1);
		
		System.out.println("Array after sorting is: ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
	}
	
	public static void quickSort(int[] arr, int low, int high) {
		
		if(low >= high)
			return;
		
		int seperationIndex = sort(arr, low, high, low);
		quickSort(arr, low, seperationIndex - 1);
		quickSort(arr, seperationIndex + 1, high);
	}
	
	public static int sort(int[] arr, int low, int high, int pivot) {
		
		while(low <= high) {
			
			while(low < arr.length && arr[low] <= arr[pivot]) {
				low++;
			}
			while(high > 0 && arr[high] > arr[pivot]) {
				high--;
			}
			
			if(low < high) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
			}
				
		}
		
		int temp = arr[high];
		arr[high] = arr[pivot];
		arr[pivot] = temp;
		return high;
	}

}
