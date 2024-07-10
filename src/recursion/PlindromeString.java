package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String str = "";
		try {
			str = bufferedReader.readLine();
		} catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		System.out.println(palindromeString(str, 0, str.length()));

	}
	
	public static boolean palindromeString(String str, int curr, int length) {
		
		//base case
		if(curr >= length / 2)
			return true;
		
		//checking if the character are same or not
		if(str.charAt(curr) != str.charAt(length - curr - 1))
			return false;
		
		//recursive call
		return palindromeString(str, curr + 1, length);
	}

}
