package hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindHighestAndLowestFreqElement {

	public static void main(String[] args) throws IOException {
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

		//Hashing for elements
		HashMap<Integer, Integer> count = new HashMap<>();
		for(int ele : element) {
			if(count.containsKey(ele)) {
				count.put(ele, count.get(ele) + 1);
			} else {
				count.put(ele, 1);
			}
		}
		
	}

}
