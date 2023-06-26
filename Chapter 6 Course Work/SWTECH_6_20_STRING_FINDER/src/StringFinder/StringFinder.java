/*
 * Author: Robert Beauchamp
 * date 6/13/2023
 * the purpose of this project is to:
 * 1: obtain a string from the user
 * 2: find the size of the string
 * 3: and find repeated characters in the string
 */
package StringFinder;

import java.util.Scanner;

public class StringFinder {

	public static int letterCount = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String stringIn = " ";
		String stringSet = "debugMe";
		
		stringGetter s1 = new stringGetter();
		s1.userString(input, stringIn, letterCount);
	}

}
