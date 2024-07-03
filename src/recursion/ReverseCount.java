package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int num = -1;
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		printReverseCount(num);

	}
	
	public static void printReverseCount(int n) {
		//base case
		if(n < 1)
			return;
		
		System.out.println(n);
		//recursive call
		printReverseCount(n - 1);
	}

}
