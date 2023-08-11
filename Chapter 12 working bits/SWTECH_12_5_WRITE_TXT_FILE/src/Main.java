import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws java.io.IOException{

		ArrayMaker array = new ArrayMaker();
		array.toString();
		
		java.io.File Excercise12_15 = new java.io.File("Excercise12_15.txt");
		
		PrintWriter writer1;
		writer1 = new PrintWriter(new File("Excercise12_15.txt"));
		writer1.write(array.toString());
		writer1.close();
		
		try {
			
		
		Scanner readIn = new Scanner(Excercise12_15);

		 while (readIn.hasNextLine()) {
	            String i = readIn.nextLine();
	            System.out.println(i);
	    }
		 	readIn.close();
		
		} catch (Exception e) {
		  e.printStackTrace();
	  }

	}
}
