package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialWithoutParameter {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int num = -1;
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(factorialWithoutParam(num));
	}
	
	public static int factorialWithoutParam(int num) {
		//base case
		if(num == 1)
			return 1;
		
		//recursive call
		return num * factorialWithoutParam(num - 1);
	}
}
