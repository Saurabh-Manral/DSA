package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArray {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array 1: ");
		int size1 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter the size of the array 2: ");
		int size2 = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter the elements of the array 1: ");
		int[] arr1 = new int[size1];
		for(int i = 0; i < size1; i++) {
			arr1[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		System.out.println("Enter the elements of the array 2: ");
		int[] arr2 = new int[size2];
		for(int i = 0; i < size2; i++) {
			arr2[i] = Integer.parseInt(bufferedReader.readLine());
		}
		
		//calling brute force approach
//		List<Integer> result = intersectionBrute(arr1, arr2);
//		result.forEach(ele -> System.out.print(ele + " "));

		//calling optimal approach
		List<Integer> result = intersectionOptimal(arr1, arr2);
		result.forEach(ele -> System.out.print(ele + " "));
	}
	
	//This is brute force approach with TC: O(n^2) and SC: O(2n)
	public static List<Integer> intersectionBrute(int[] arr1, int[] arr2) {
		int[] temp = new int[arr2.length];
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++) {
				if(arr2[j] == arr1[i] && temp[j] == 0) {
					result.add(arr2[j]);
					temp[j] = 1;
					break;
				} else if(arr2[j] > arr1[i])
					break;
			}
		}
		
		return result;
	}
	
	//This is optimal approach with TC: O(n1 + n2) and SC: O(n1 + n2)
	public static List<Integer> intersectionOptimal(int[] arr1, int[] arr2) {
		int i = 0, j = 0;
		List<Integer> result = new ArrayList<Integer>();
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				result.add(arr1[i]);
				i++;
				j++;
			} else if(arr1[i] < arr2[j])
				i++;
			else
				j++;
		}
		
		return result;
	}

}
