/*
 * Author: Robert Beauchamp
 * Date: 6/22/2023
 * 
 * The goals of this project are:
 * Create an account object
 * Create setters & getters to modify the account
 * Implement private variables to be modified by said setters & getters.
 * Create an example account with date created and functionality to deposit/withdraw
 * create functionality to find the next month's projected balance after interest.
 */
package accountDetails;

import java.util.Date;
import java.util.Scanner;

public class account {

	public account() {
		
	}
	//create variables to exist in account objects
	private static int id = 0;
	private static double balance = 0.00;
	private static double annualInterestRate = 0;
	private static Date dateCreated; 
	private static String functionOption = "";
	
	//create account object

	public void setDateCreated() {
		dateCreated = new java.util.Date();
		
	}
	public int getAccount() {
		
		return id;
	}
	
	public void setAccount(int newAccount) {
		
		id = newAccount;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	public void setBalance(double newBalance) {

		balance = newBalance; 
	}
	
	public double getAnnualInterestRate() {
		
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newRate) {

		annualInterestRate = newRate;
	}

	public static double getMonthlyInterestRate() {
		double monthlyInterestRate = (annualInterestRate/100)/12;
		
		return monthlyInterestRate;
	}
	
	public static double monthlyInterestGain() {
		double grossGain = balance * getMonthlyInterestRate();
		balance = balance + grossGain;
		
		System.out.println("your new balance after one month will be: $" + balance);
		return balance;
	}
	
	public static double withdraw(Scanner input) {
		System.out.print("Please specify how much you would like to withdraw: $ ");
		double cashOut = input.nextDouble();
		balance -= cashOut;
		
		if (balance < 0) {
			System.out.println("ERROR, OVERDRAFT, TRY AGAIN.");
			withdraw(input);
		}
		
		System.out.println("New balance: $" + balance);
		
		return balance;
	}
	
	public static double deposit(Scanner input) {
		System.out.print("Please specify how much you would like to deposit: $ ");
		double cashIn = input.nextDouble();
		balance += cashIn;
		
		if (cashIn <= 0) {
			System.out.println("ERROR, INVALID DEPOSIT, TRY AGAIN.");
			deposit(input);
		}
			
		System.out.println("New balance: $" + balance);
		
		return balance;
		
	}
	
	public static String menuProcessing(Scanner input) {	
		String functionOption = input.nextLine();
		
		if(functionOption.equalsIgnoreCase("x")) {
			System.exit(id);
			return functionOption;
		}else {
			switch(functionOption) {
		
			case "1": withdraw(input); 
			break;
			
			case "2": deposit(input); 
			break;
			
			case "3": monthlyInterestGain(); 
			break;			
			}
		}
			return functionOption;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		account defaultAccount = new account();
		defaultAccount.setAccount(1122);
		defaultAccount.setBalance(20000.00);
		defaultAccount.setAnnualInterestRate(4.5);
		defaultAccount.setDateCreated();
		
		System.out.println("Welcome to the bank's main interface!/n");
		System.out.println("Account # " + defaultAccount.getAccount()+ " (opened on:" + dateCreated.toString());
		System.out.println("Balance : $" + defaultAccount.getBalance());
		System.out.println("Annual interest rate: " + defaultAccount.getAnnualInterestRate() + "%");
		System.out.println("Please Choose a function:");
		System.out.println("1: Make a withdrawal");
		System.out.println("2: Make a deposit");
		System.out.println("3: Process and display one month of interest.");
		System.out.println("x: to terminate the program.");
		
		for(int i = 0; i < 1; i += 0) {
			menuProcessing(input);
		}
	}
}

