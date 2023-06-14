/*
 * Author: Robert Beauchamp
 * Date 6/14/2023
 * 
 * This program will ensure that a password input is a valid new password.
 * The following conditions MUST be met:
 * 1: must contain EIGHT CHARACTERS
 * 2: must contain EXCLUSIVELY DIGITS or CHARACTERS
 * 3: must contain TWO DIGITS (Minimum string size of TEN)
 * 
 * step 1 generate input
 * step 2 find length
 * step 3 find characters
 * step 4 find digits
 * step 5 generate prompts
 */
package Main;

public class PasswordMain {

	public static String userPassword;
	
	public static void main(String[] args) {
		PasswordInput p = new PasswordInput();
		p.promptAndTakeUserInput(userPassword);
		
//		PasswordProcessing pp1 = new PasswordProcessing(userPassword);
//		
//		if(pp1.passwordLength(userPassword) && pp1.passwordCharCheck(userPassword) && pp1.numAmountCheck(userPassword) && pp1.charAmountCheck(userPassword)) {
//			System.out.println("Your password is valid!");
//		} else {
//			System.out.println("Your password is invalid. Try again");
//		}
		
	}

}
