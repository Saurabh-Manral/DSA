package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MovingZerosToEnd {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

//		moveZerosToTheEndBrute(arr, size);
//		System.out.println("Array after moving zeros is: ");
//		for(int ele : arr)
//			System.out.print(ele + " ");
		
		moveZeroToTheEndOptimal(arr, size);
		System.out.println("Array after moving zeros is: ");
		for(int ele: arr)
			System.out.print(ele + " ");
	}
	
	//This is brute force approach with TC: O(2n) and SC: O(n)
	public static void moveZerosToTheEndBrute(int[] arr, int size) {
		
		List<Integer> nonZeroElement = new LinkedList<>();
		for(int i = 0; i < size; i++) {
			if(arr[i] != 0)
				nonZeroElement.add(arr[i]);
		}
		
		Iterator<Integer> listElement = nonZeroElement.iterator();
		int i = 0;
		while(listElement.hasNext()) {
			arr[i] = listElement.next();
			i++;
		}
		
		for(;i < size; i++) {
			arr[i] = 0;
		}
	}
	
	//This is optimal approach with TC: O(n) and SC: O(1)
	public static void moveZeroToTheEndOptimal(int[] arr, int size) {
		//finding first zero element index
		int i = 0;
		while(i < size && arr[i] != 0)
			i++;
		//finding first non zero element index
		int j = i;
		while(j < size && arr[j] == 0)
			j++;
		
		while(j < size && i < j) {
			if(arr[j] != 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
				i++;
			} else
				j++;
		}
	}

}
