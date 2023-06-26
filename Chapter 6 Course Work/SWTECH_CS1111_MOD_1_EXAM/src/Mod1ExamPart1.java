/*
Author: Robert Beauchamp
Date: 06/15/2023

Sample input/output:
	income = $200.00,   expense = $100.00,  months = 3, savings = $300.00
	income = $200.00,   expense = $100.00,  months = 6, savings = $600.00
	income = $2000.00,  expense = $800.00,  months = 3, savings = $3600.00
	income = $2000.00,  expense = $800.00,  months = 6, savings = $7200.00
*/
import java.util.Scanner;

class Mod1ExamPart1 {
	
	private static double income = 0.0;	 // Stores the user's monthly income
	private static double expense = 0.0; 	 // Stores the user's monthly expenses
	private static double savings = 0.0;	 // Stores the user's calculated savings
	private static int months = 0;			 // Stores the number of months the user is saving for
	 
	public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            
            netSave(input);
            // Call method to populate value for savings
            // The call statement is worth 2 pts
            
        }   
        
        // Create your method here
	public static double netSave(Scanner input) {
		netIncome(input);
		monthlySaving(input);
		
		for(int i = 0; i < months; i++) {
			savings += income;
		}
		
		System.out.printf("After %d months you will have saved $%.2f", months, savings);
		return savings;
	}
	public static double netIncome(Scanner input) {
		System.out.print("Enter your income for 1 month: $");
        income = input.nextDouble();

        System.out.print("Enter your expenses for 1 month: $");
        expense = input.nextDouble();
        
        income = income - expense;
        
        return income;
	}
	
	public static int monthlySaving(Scanner input) {
		System.out.print("Enter number of months you are saving: ");	
        months = input.nextInt();
        
        return months;
	}
        // The method header is worth 2 pts
        // The method result is worth 3 pts
        // The method should contain a loop calculating savings for each month
        // The loop is worth 3 pts
}