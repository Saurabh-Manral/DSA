package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int num = -1;
		System.out.println("Enter the number: ");
		try {
			num = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		printName(1, num);
	}
	
	
	public static void printName(int i, int n) {
		//Base Condition
		if(i > n)
			return;
		
		System.out.println("Saurabh");
		
		//recursive call
		printName(i + 1, n);
	}

}
