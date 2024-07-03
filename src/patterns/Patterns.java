package patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patterns {

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int rows = -1;
		//reading no. of rows
		try {
			System.out.println("Enter the number of rows: ");
			rows = Integer.parseInt(bufferedReader.readLine());
		} catch(IOException ex) {
			System.out.println("Input is not correct: " + ex.getMessage());
		}
//		
		
		//pattern printing method calls
		
		//boxPattern(rows);
		//rightAngleTrianglePattern(rows);
		//rightAngleTriangleNumberPattern(rows);
		//rightAngleTriangleNumberPattern2(rows);
		//reversedRightAngleTrianglePattern(rows);
		//reversedRightAngleTriangleNumberPattern(rows);
		//trianglePattern(rows);
		//trianglePattern2(rows);
		//reversedTrianglePattern(rows);
		//invertedAndNonInvertedTrianglePattern(rows);
		//rightFacedTrianglePattern(rows);
		//rightAngleTriangleBinaryPattern(rows);
		//invertedPatternOfSpaceAndRemainingNumbers(rows);
		//rightAngleTriangleOfNumbers(rows);
		//rightAngleTriangleOfAlphabet(rows);
		//invertedRightAngleTriangleAlphabetPattern(rows);
		//rightAngleTriangleOfSameAlphabetsPattern(rows);
		//triangleOfAlphabetsWithSimilarityPattern(rows);
		//rightAngleTriangleOfReverseAlphabets(rows);
		//squareWithDiamondSpacedPattern(rows);
		//rightAndLeftFacedTrianglePattern(rows);
		hollowSquarePattern(rows);
	}
	//box pattern
	public static void boxPattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//right angle triangle pattern
	public static void rightAngleTrianglePattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//right angle triangle number pattern
	public static void rightAngleTriangleNumberPattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	//right angle triangle number pattern 2
	public static void rightAngleTriangleNumberPattern2(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print((i+1) + " ");
			}
			System.out.println();
		}
	}
	
	//reversed right angle triangle pattern
	public static void reversedRightAngleTrianglePattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//reversed right angle triangle number pattern
	public static void reversedRightAngleTriangleNumberPattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows - i; j++) {
				System.out.print(j+1 + " ");
			}
			System.out.println();
		}
	}
	
	//triangle pattern
	public static void trianglePattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			//printing front spacing
			for(int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			//printing stars
			for(int j = 0; j < i + (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//triangle pattern method2
	public static void trianglePattern2(int rows) {
		for(int i = 0; i < rows; i++) {
			//printing front spacing
			for(int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			//printing stars
			for(int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			//printing end stars
			for(int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	//reversed triangle pattern
	public static void reversedTrianglePattern(int rows) {
		for(int i = 0; i < rows; i++) {
			//printing the front spacing
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			//printing the stars
			for(int j = 0; j < (rows*2) - ((i*2) + 1); j++) {
				System.out.print("*");
			}
			//printing the end spacing
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	//inverted and non-inverted triangle pattern
	public static void invertedAndNonInvertedTrianglePattern(int rows) {
		trianglePattern2(rows);
		reversedTrianglePattern(rows);
	}
	
	//right faced triangle pattern
	public static void rightFacedTrianglePattern(int rows) {
		for(int i = 1; i <= 2*rows - 1; i++) {
			int stars = i;
			if(i > rows)
				stars = 2*rows - i;
			//printing the stars
			for(int j = 0; j < stars; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	//right angle triangle in binary numbers
	public static void rightAngleTriangleBinaryPattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			int num = 0;
			if(i % 2 != 0)
				num = 1;
			else
				num = 0;
			for(int j = 0; j < i; j++) {
				System.out.print(num + " ");
				num = 1 - num;
			}
			System.out.println();
		}
	}

	//inverted triangle of space and remaining numbers pattern
	public static void invertedPatternOfSpaceAndRemainingNumbers(int rows) {
		for(int i = 1; i <= rows; i++) {
			//printing first numbers right angle triangle
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			//printing the spaces
			for(int j = 1; j <= 2*rows - 2*i; j++) {
				System.out.print(" ");
			}
			//printing second numbers flipped right angle triangle
			for(int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

	//right angle triangle of numbers
	public static void rightAngleTriangleOfNumbers(int rows) {
		int count = 1;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}

	//right angle triangle of capital alphabet
	public static void rightAngleTriangleOfAlphabet(int rows) {
		for(int i = 0; i < rows; i++) {
			char c = 'A';
			for(int j = 0; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
	}

	//inverted right angle triangle of alphabet pattern
	public static void invertedRightAngleTriangleAlphabetPattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(char j = 'A'; j < 'A' + rows - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	//right angle triangle of same capital alphabets
	public static void rightAngleTriangleOfSameAlphabetsPattern(int rows) {
		for(int i = 0; i < rows; i++) {
			char c = (char) ('A' + i);
			for(int j = 0; j <= i; j++) {
				System.out.print(c + " ");
			}
			
			System.out.println();
		}
	}
	
	//triangle pattern of alphabets
	public static void triangleOfAlphabetsPattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			//printing front spaces
			for(int j = 0; j < rows - i; j++) {
				System.out.print(" ");
			}
			
			//printing characters
			
			//printing end spaces
			for(int j = 0; j < rows - 1; j++) {
				System.out.print(" ");
			}
		}
	}
	
	//triangle pattern of alphabets with similarity
	public static void triangleOfAlphabetsWithSimilarityPattern(int rows) {
		for(int i = 1; i <= rows; i++) {
			//printing front spaces
			for(int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			char c = 'A';
			//printing the characters
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(c);
				if(j < ((2 * i - 1) / 2) + 1)
					c++;
				else
					c--;
			}
			
			//printing end spaces
			for(int j = 1; j < rows - i; j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}

	//right angle triangle pattern of reverse alphabets
	public static void rightAngleTriangleOfReverseAlphabets(int rows) {
		
		for(int i = 1; i <= rows; i++) {
			char c = (char) ('A' + rows - i);
			
			for(int j = 1; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}
	
	//square pattern with inside diamond spaced pattern
	public static void squareWithDiamondSpacedPattern(int rows) {
		for(int i = 1; i <= rows * 2; i++) {
			//printing front stars
			int jt = 0;
			if(i <= (2 *rows) / 2)
				jt = rows - i + 1;
			else
				jt = i - rows;
			for(int j = 1; j <= jt; j++) {
				System.out.print("*");
			}
			
			//printing middle spaces
			jt = 0;
			if(i <= (2*rows) / 2)
				jt = 2 * i - 2;
			else
				jt = ((2 * rows) - i) * 2;
			for(int j = 1; j <= jt; j++) {
				System.out.print(" ");
			}
			
			//printing end stars
			jt = 0;
			if(i <= (2 *rows) / 2)
				jt = rows - i + 1;
			else
				jt = i - rows;
			for(int j = 1; j <= jt; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	//right and left faced triangle pattern
	public static void rightAndLeftFacedTrianglePattern(int rows) {
		int spaces = (2 * rows);
		for(int i = 1; i <= rows * 2 - 1; i++) {
			
			//printing front stars
			int stars = 0;
			if(i <= rows) {
				stars = i;
			} else {
				stars = 2*rows - i;
			}
			for(int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			
			//printing middle spaced
			if(i <= rows) {
				spaces -= 2;
			} else {
				spaces += 2;
			}
			for(int j = 1; j <= spaces; j++) {
				System.out.print(" ");
			}
			
			
			//printing end spaces
			stars = 0;
			if(i <= rows) {
				stars = i;
			} else {
				stars = 2*rows - i;
			}
			for(int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	//hollow square pattern
	public static void hollowSquarePattern(int rows) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < rows; j++) {
				if(i == 0 || i == rows-1 || j == 0 || j == rows - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
