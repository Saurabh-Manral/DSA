package hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCountArrayHashing {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your string: ");
		String str = bufferedReader.readLine();
		
		int size = 'z' - 'a' + 1;
 		int[] arrHashing = new int[size];
 		hashingCount(arrHashing, str);
 		
 		System.out.println("Enter charcter for count: ");
 		char c = (char) bufferedReader.read();
 		printCount(c, arrHashing);
	}
	
	public static void hashingCount(int[] arr, String str) {
		
		for(int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
	}
	
	public static void printCount(char c, int[] arr) {
		System.out.println("It's count is: " + arr[c - 'a']);
	}

}
