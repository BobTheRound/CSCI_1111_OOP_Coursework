package triangleMaker;

import java.util.Scanner;

public class triangleShape {
	
	public triangleShape() {
	
	}
	
	double[] triangleWalls(Scanner input, double[] wallLength){
		System.out.println("Please input the three sides of your triangle.");
		
		for(int i  = 0; i < 3; i++) {
			wallLength[i] = input.nextDouble();
		}
		return wallLength;
	}
		
	double triangleArea(double[] wallLength, double triArea) {
		double s = (wallLength[0] + wallLength[1] + wallLength[2]) / 2;
		triArea = Math.sqrt(s * ((s - wallLength[0]) * (s - wallLength[1]) * (s - wallLength[2])));
		
		System.out.println("The triangle of " + wallLength[0] + ", " + wallLength[1] + ", and " + wallLength[2] + " has an area of " + triArea);
		return triArea;
	}
	
	boolean amTriangle(Scanner input, double[] wallLength, double triArea) {
		triangleWalls(input, wallLength);
		if(wallLength[0] + wallLength[1] <= wallLength[2] ^ wallLength[1] + wallLength[2] <= wallLength[0] ^ wallLength[2] + wallLength[0] <= wallLength[1]) {
			System.out.print("Incorrect input, object is not a triangle.");
			return false;
		}else{
			triangleArea(wallLength, triArea);
			return true;
		}
	}

}
	
