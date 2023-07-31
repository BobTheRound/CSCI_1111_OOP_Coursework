/*
 * Author: Robert Beauchamp
 * Date 7/13/2023
 * 
 * Objectives:
 * 
 * Use the Account class created in Programming Exercise 9.7 
 * to simulate an ATM machine. Create ten accounts in an array 
 * with id 0, 1,..., 9, and initial balance $100. 
 * 
 * The system prompts the user to enter an id. If the id is entered incorrectly, 
 * ask the user to enter a correct id. Once an id is accepted, the main menu is 
 * displayed as shown in the sample run. You can enter a choice 
 * 1 for viewing the current balance, 
 * 2 for withdrawing money, 
 * 3 for depositing money, and 
 * 4 for exiting the main menu. 
 * 
 * Once you exit, the system will prompt for an id again. Thus, once the system starts, it will not stop.
 * 
 * The UML diagram for this class will be the same as the previous Account class. 
 * In your executable class, is there anything that needs to be repeated? If so, 
 * what steps of the algorithm are they?
 */

package account;

import java.util.Date;
import java.util.Scanner;

public class AccountRedux {
	static Account[] accounts;
	static Account[] createAccounts() {
		Account account = new Account();
	
		account.setDateCreated();

		accounts = new Account[10];
		for (int j = 0; j < 10; j++) {
			accounts[j] = new Account(j, account.setDateCreated(), account.getBalance());
		}
		
		return accounts;
	}

	public static void menuPrint(Account[] accounts) {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 1; i += 0) {
			Account selectedAccount = accountSelect(input);
		
			menuProcessing(input, selectedAccount);
		}	
	}
	
	static public Account accountSelect(Scanner input) {
		System.out.println("Welcome to the ATM's main interface!\n");
		System.out.print("Please select your account: ");
		
		int lookupID = input.nextInt();
		System.out.println("Account "+accounts[lookupID]+ " $" + accounts[lookupID].getBalance() + " created on " + accounts[lookupID].setDateCreated());
		
		return accounts[lookupID];
	}
	
	public static String menuProcessing(Scanner input, Account activeAccount) {	
		System.out.println("Please Choose a function:");
		System.out.println("1: Make a withdrawal");
		System.out.println("2: Make a deposit");
		System.out.println("3: Check the Account balance");
		System.out.println("4: Return to account select");
		String functionOption = input.next();
		
			switch(functionOption) {
		
			case "1": activeAccount.withdraw(input); 
			menuProcessing(input, activeAccount);
			break;
			
			case "2": activeAccount.deposit(input);
			menuProcessing(input, activeAccount);
			break;
			
			case "3": activeAccount.checkBalance();
			menuProcessing(input, activeAccount);
			case "4": accountSelect(input);
			break;			
			}
			
			return functionOption;
	}

	public static void main(String[] args) {
		Account[] accountsInMain = createAccounts();
		menuPrint(accountsInMain);
	}

}
