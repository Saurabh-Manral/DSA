package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumConsicutiveOnes {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int size = Integer.parseInt(bufferedReader.readLine());
		
		System.out.println("Enter the elements of the array: ");
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(bufferedReader.readLine());
		}

		System.out.println("The maximum consicutive ones are: " + consecutiveOnesOptimal(arr, size));
	}
	
	//This is optimal approach with TC: O(n) and SC: O(1)
	public static int consecutiveOnesOptimal(int[] arr, int size) {
		int maximum = 0, count = 0;
		
		for(int i = 0; i < size; i++) {
			if(arr[i] == 1)
				count++;
			else {
				if(maximum < count) {
					maximum = count;
				}
				count = 0;
			}
		}
		
		if(maximum < count)
			maximum = count;
		
		return maximum;
	}

}
