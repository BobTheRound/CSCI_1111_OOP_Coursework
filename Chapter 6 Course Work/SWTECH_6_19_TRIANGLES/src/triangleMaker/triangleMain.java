/*
 * Author: Robert Beauchamp
 * Date 6/12/2023
 * the purpose of this project is to define and create a triangular object.
 */
package triangleMaker;

import java.util.Scanner;

public class triangleMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] wallLength = new double [3];
		double triArea = 0;
		
		triangleShape ts = new triangleShape();
		
		ts.amTriangle(input, wallLength, triArea);
	}
	
}

