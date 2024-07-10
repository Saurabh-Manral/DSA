package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}
		Arrays.sort(arr);
		
		//Brute approach call
//		int sortedIndex = removeDuplicateBrute(arr, size);
//		for(int i = 0; i < sortedIndex; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		//optimal approach call
		int sortedIndex = removeDuplicateOptimal(arr, size);
		for(int i = 0; i < sortedIndex; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//This is brute force approach where the time complexity is O(2n) and space complexity is O(n)
	public static int removeDuplicateBrute(int[] arr, int size) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < size; i++) {
			set.add(arr[i]);
		}
		
		Iterator<Integer> itr = set.iterator();
		int i = 0;
		while(itr.hasNext()) {
			arr[i] = itr.next();
			i++;
		}
		return i;
	}
	
	//This is optimal solution of the problem with time complexity of O(n)
	public static int removeDuplicateOptimal(int[] arr, int size) {
		int first = 0;
		
		for(int i = 1; i < size; i++) {
			if(arr[i] != arr[first]) {
				arr[first+1] = arr[i];
				first++;
			}
		}
		
		return first + 1;
	}

}
