
import java.util.Scanner;

public class NumberArray {
	
	private int[] array = new int[100]; 
	private double turnMeToInt;
	private int pickMe;
	
	NumberArray(){
		
	}
	
	public int[] getArray() {
		
		for (int i = 0; i < 100; i++) {
			turnMeToInt = Math.random() * 100;
			int value = (int)turnMeToInt;
			array[i] = value;
		}
		return array;
	}
	
	public void setPick(int pickMe) {
		pickMe = this.pickMe;
	}
	
	public int userPick() {
		Scanner input = new Scanner(System.in);
		System.out.println("please pick your index within the array.");
		pickMe = input.nextInt();
		
		return pickMe;
	}	
	
	public String toString() {
		return "at " + pickMe + " the number is " + array[pickMe];
	}
		
}
