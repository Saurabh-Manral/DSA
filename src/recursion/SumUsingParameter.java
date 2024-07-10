package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumUsingParameter {

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
		sumUsingParameters(num, 0);
	}
	
	public static void sumUsingParameters(int n, int sum) {
		if(n < 1) {
			System.out.println(sum);
			return;
		}
			
		//recursive call
		sumUsingParameters(n - 1, sum + n);
	}

}
