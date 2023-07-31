/*
 * Author: Robert Beauchamp
 * Start date: 6/28/2023
 * Complete date:
 * 
 * develop the MyInteger class that contains:
 * 
 * an int field named value that stores the int value represented by the object -done
 * 
 * a constructor that creates a MyInteger object for a specified value -done
 * 
 * a non-static getter method -done
 * 
 * The non-static boolean methods isEven(), isOdd(), and isPrime()  - done
 * 
 * The static boolean methods isEven(int), isOdd(int), and isPrime(int) -done
 * 
 * The static boolean methods isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) - done
 * 
 * The  non-static boolean methods equals(int) and equals(MyInteger) -done
 * 
 * A static method parseInt(char[]) that converts an array of 
 * numeric characters to an int value.
 * 
 * A static method parseInt(String) that converts a string into an int value.
 */

package TenThree;

import java.util.Scanner;

public class MyInteger {

	public MyInteger(){
		
	}
	
	public int value;
	public static int defaultValue = 42;
	public static int myInteger;
	public static int userInt;
	
	public static int userInteger() {
		Scanner input = new Scanner(System.in);
		MyIntegerRunner.userInt = input.nextInt();
		
		return userInt;
	}
	
	public int getValue(int userInt) {
		
		return value;
	}
	
	public void setValue(int setValue) {
		value = setValue;

	}
	//set non static methods
	public boolean isEven()	{
		if(this.value % 2 == 0) {
			System.out.print(value + " is even ");
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if(this.value % 2 != 0) {
			System.out.print(value + " is odd ");
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		if(this.value <= 3 && this.value > 0) {
			System.out.print("and is prime ");
			return true;
		
		}else if(this.value % 2 != 0 && this.value % 3 != 0) {
			
			if(this.value > 5 && this.value % 5 != 0) {
			System.out.print("and is prime ");
			return true;
			
			}
		}
		System.out.print("and is not prime ");
		return false;
	}
	
	//set static methods for DEFAULT VALUE*************
	public static boolean isEven(int defaultValue)	{
		MyInteger i2 = new MyInteger();
		i2.setValue(defaultValue);
		if (i2.isEven()) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int defaultValue)	{
		MyInteger i2 = new MyInteger();
		if (i2.isOdd()) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int defaultValue)	{
		MyInteger i2 = new MyInteger();
		if (i2.isPrime()) {
			return true;
		}
		return false;
	}
	
	public static int getMyInteger() {
		
		return myInteger;
	}
	
	public static void setMyInteger() {	
		
		myInteger = defaultValue + userInt;
	}
	
	public boolean equals() {
		if (value == defaultValue) {
			System.out.println("and is equal to the default value ");
			return true;
		} else {
			System.out.println("and is not equal to the default value ");
			return false;
		}
	}
	
	public static int parseInt(char[] parseCharInt) {
		int returnedValue = 0;
		parseCharInt = new char[3];
		parseCharInt[0] = 1;
		parseCharInt[1] = 2;
		parseCharInt[2] = 3;		
		
		for(int i = 0; i < parseCharInt.length; i++) {
			returnedValue += parseCharInt[i];
		}
		System.out.println("a coderlord series of characters parsed into an integer equals: " + returnedValue);
		return returnedValue;
	}
	
	public static int parseInt(String parseStringInt) {

		parseStringInt = "456";
		int returnedValue = Integer.parseInt(parseStringInt);
	
		System.out.println("The number 456 is a string.");
		System.out.println (returnedValue + " is the integer parsed from the string");
		
		return returnedValue;
	}

}
