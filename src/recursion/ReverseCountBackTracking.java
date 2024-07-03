package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCountBackTracking {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = -1;
		System.out.println("Enter the number: ");
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		reverseCount(1, num);
	}
	
	public static void reverseCount(int i, int n) {
		//base case
		if(i > n)
			return;
		
		//recursive call
		reverseCount(i + 1, n);
		
		System.out.println(i);
	}
}

