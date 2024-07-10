package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int num = -1;
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(fibonacci(num));

	}
	
	public static int fibonacci(int n) {
		//base case
		if(n <= 1)
			return n;
		
		//recursive calls
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
