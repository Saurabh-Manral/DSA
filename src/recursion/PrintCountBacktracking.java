package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintCountBacktracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int num = -1;
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		printCountUsingBacktracking(num);
	}
	
	public static void printCountUsingBacktracking(int n) {
		
		//base case
		if(n < 1)
			return;
		
		//recursive call
		printCountUsingBacktracking(n - 1);
		
		System.out.println(n);
	}

}
