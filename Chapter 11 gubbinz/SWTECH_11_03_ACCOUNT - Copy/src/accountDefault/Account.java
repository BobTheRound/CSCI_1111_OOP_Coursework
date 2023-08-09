package accountDefault;

import java.util.Date;
import java.util.Scanner;

	public class Account {
		
	private int id;
	private double balance = 100;
	private Date dateCreated; 
	
	Account() {
		
	}
	Account(int id, Date date, double balance) {
		this.id = id;
		this.balance = balance;
	}

	public void getDateCreated() {
		dateCreated = new java.util.Date();
	}
	
	public Date setDateCreated() {
		getDateCreated();
		return dateCreated;
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

		this.balance = newBalance; 
	}
	
	public double withdraw(Scanner input) {
		System.out.print("Please specify how much you would like to withdraw: $ ");
		
		double cashOut = input.nextDouble();
		this.balance -= cashOut;
		
		if (this.balance < 0) {
			this.balance += cashOut;
			System.out.println("ERROR, OVERDRAFT, TRY AGAIN.");
			withdraw(input);
		}
		
		System.out.println("New balance: $" + this.balance);
		
		return this.balance;
		
	}
	
	public double deposit(Scanner input) {
		System.out.print("Please specify how much you would like to deposit: $ ");
		double cashIn = input.nextDouble();
		this.balance += cashIn;
		
		if (cashIn <= 0) {
			this.balance -= cashIn;
			System.out.println("ERROR, INVALID DEPOSIT, TRY AGAIN.");
			deposit(input);
		}
			
		System.out.println("New balance: $" + this.balance);
		
		return this.balance;
		
	}
	
	public void checkBalance() {
		System.out.println("$" + this.balance + " is the current balance of your account");
	}
	 
	
}


