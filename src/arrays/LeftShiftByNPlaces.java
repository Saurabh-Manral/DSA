package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeftShiftByNPlaces {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		System.out.println("Enter the value of N: ");
		int N = Integer.parseInt(bufferedReader.readLine());
		
//		leftRotateArrayByNBrute(arr, N, size);
//		System.out.println("The element after rotation is: ");
//		for(int ele : arr) {
//			System.out.print(ele + " ");
//		}
		
		leftRotateArrayByNOptimal(arr, N, size);
		System.out.println("The element after rotation is: ");
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
	}
	
	//rotate array left by N position brute force with TC: O(N) and SC: O(N)
	public static void leftRotateArrayByNBrute(int[] arr, int N, int size) {
		N = N % size;
		int[] temp = new int[N];
		for(int i = 0; i < N; i++)
			temp[i] = arr[i];
		
		//shifting element
		int i;
		for(i = N; i < size; i++)
			arr[i - N] = arr[i];
		
		for(int j = 0; j < N; j++, i++)
			arr[i - N] = temp[j];
	}
	
	//rotate array left by N position with optimal approach with TC: O(N) and SC: O(1)
	public static void leftRotateArrayByNOptimal(int[] arr, int N, int size) {
		N = N % size;
		rotateArray(arr, 0, N - 1);
		rotateArray(arr, N, size - 1);
		rotateArray(arr, 0, size - 1);
	}
	
	public static void rotateArray(int[] arr, int start, int end) {
		int i = start, j = end;
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
