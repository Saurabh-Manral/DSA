package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the first number: ");
			int num1 = Integer.parseInt(String.valueOf(bufferedReader.readLine()));
			System.out.println("Enter the second number: ");
			int num2 = Integer.parseInt(String.valueOf(bufferedReader.readLine()));
			
			System.out.println("The sum of both the number is: " + (num1 + num2));
		} catch(IOException ex) {
			System.out.println("Error in reading input." + ex.getMessage());
		} catch(Exception ex) {
			System.out.println("Please enter the number: " + ex.getMessage());
		}

	}

}
