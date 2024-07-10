package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		mergeSort(arr, 0, size - 1);
		
		System.out.println("Array after sorting is: ");
		for(int ele : arr)
			System.out.print(ele + " ");

	}
	
	//merge sort the array
	public static void mergeSort(int[] arr, int low, int high) {
		if(low >= high)
			return;
		
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		
		merge(arr, low, mid, high);
	}
	
	//merge the two half of sorted array
	public static void merge(int[] arr, int low, int mid, int high) {
		int size = high - low + 1;
		int l = low, r = mid + 1;
		int[] temp = new int[size];
		
		int i = 0;
		while(l <= mid && r <= high) {
			if(arr[l] <= arr[r]) {
				temp[i] = arr[l];
				l++;
				i++;
			} else {
				temp[i] = arr[r];
				r++;
				i++;
			}
		}
		
		//filling remaining element of first subarray
		while(l <= mid) {
			temp[i] = arr[l];
			l++;
			i++;
		}
		
		//filling remaining element of second subarray
		while(r <= high) {
			temp[i] = arr[r];
			r++;
			i++;
		}
		
		//copy element back to array
		for(int ele : temp) {
			arr[low] = ele;
			low++;
		}
	}

}
