package Main;

import java.util.Scanner;

public class PasswordInput {

	public PasswordInput(){
		
	}
	
	public String promptAndTakeUserInput(String userPassword) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a new password, it must contain at least eight letters and two numbers");
		System.out.println("the password may NOT contain special characters or spaces (!@#$%^&()");
		
		userPassword = input.nextLine();
		
		PasswordProcessing pp1 = new PasswordProcessing(userPassword);
		
		if(pp1.passwordLength(userPassword) && pp1.passwordCharCheck(userPassword) && pp1.numAmountCheck(userPassword) && pp1.charAmountCheck(userPassword)) {
			System.out.println("Your password is valid!");
		} else {
			System.out.println("Your password is invalid. Try again.\n \n");
			promptAndTakeUserInput(userPassword);
		}
		return userPassword;
	}
	
}
