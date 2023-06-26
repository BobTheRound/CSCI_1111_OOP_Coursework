package StringFinder;

import java.util.Scanner;

public class stringGetter {

	public stringGetter(){

	}
	
	String userString(Scanner input, String stringIn, int letterCount){
		System.out.println("Please input a string: ");

		stringIn = input.nextLine();
		
		stringSorting s2  = new stringSorting(stringIn);
		s2.displayString(stringIn);
		s2.stringSize(stringIn);
		s2.letterSetter(stringIn, letterCount);
		
		return stringIn;
	}
	
}
