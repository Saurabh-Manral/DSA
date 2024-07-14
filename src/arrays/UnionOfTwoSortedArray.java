package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array 1: ");
		int size1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the size of the array 2: ");
		int size2 = Integer.parseInt(bufferedReader.readLine());
		
		int[] arr1 = new int[size1];
		int[] arr2 = new int[size2];
		System.out.println("Enter the elements of the array 1: ");
		for(int i = 0; i < size1; i++) {
			arr1[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		System.out.println("Enter the elements of the array 2: ");
		for(int i = 0; i < size2; i++) {
			arr2[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		
		int[] result = unionOfTwoSortedArrayOptimal(arr1, arr2);
		
		for(int i = 0; i < result.length; i++) {
			if(i == 0)
				System.out.print(result[i] + " ");
			else {
				if(result[i] > result[i - 1])
					System.out.print(result[i] + " ");
			}
		}
		
	}
	
	//The is brute force approach with TC: O(2ni + 2nj) and SC: O(ni + nj)
	public static int[] unionOfTwoSortedArrayBrute(int[] arr1, int[] arr2) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0; i < arr1.length; i++)
			set.add(arr1[i]);
		for(int i = 0; i < arr2.length; i++)
			set.add(arr2[i]);
		
		int[] unionArray = new int[set.size()];
		int i = 0;
		for(int ele : set) {
			unionArray[i] = ele;
			i++;
		}
		
		return unionArray;
	}
	
	public static int[] unionOfTwoSortedArrayOptimal(int[] arr1, int[] arr2) {
		int i = 0, j = 0, k = 0;
		int[] result = new int[arr1.length + arr2.length];
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				if(result[k] < arr1[i]) {
					result[k] = arr1[i];
					k++;
				}
				i++;
			} else {
				if(result[k] < arr2[j]) {
					result[k] = arr2[j];
					k++;
				}
				j++;
			}
		}
		
		while(i < arr1.length) {
			if(result[k] < arr1[i]) {
				result[k] = arr1[i];
				k++;
			}
			i++;
		}
		
		while(j < arr2.length) {
			if(result[k] < arr2[j]) {
				result[k] = arr2[j];
				k++;
			}
			j++;
		}
		
		return result;
	}

}
