package accountDefault;

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
		if(lookupID > accounts.length ^ lookupID < 0) {
			System.out.println("ERROR invalid input, try again please.");
			menuPrint(accounts);
		}
		System.out.println("Account "+ accounts[lookupID] + " $" + accounts[lookupID].getBalance() + " created on " + accounts[lookupID].setDateCreated());
		
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
			
			default : System.out.println("Invalid Input, please try again.");
			menuProcessing(input, activeAccount);
			break;
			}
			
			return functionOption;
	}

	public static void main(String[] args) {
		Account[] accountsInMain = createAccounts();
		menuPrint(accountsInMain);
	}

}

