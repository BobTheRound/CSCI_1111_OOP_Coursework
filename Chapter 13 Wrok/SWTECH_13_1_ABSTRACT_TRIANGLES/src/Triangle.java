
import java.util.Scanner;

public class Triangle extends GeometricObject{

	private double area;
	private double side1;
	private double side2;
	private double side3;
	private double[] triangleWalls = new double[3];
	
	private double perimeter;
	
	Triangle(){
		
	}
	
	public double[] getTriangleWalls() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < triangleWalls.length; i++) {
			int j = i;
			System.out.println("please input the size of wall " + (j += 1));
			triangleWalls[i] = input.nextDouble();
		}
		System.out.println("debugMe getTriangleWalls " + triangleWalls[0] + " " + triangleWalls[1] + " " + triangleWalls[2] + " ");//debug statement
		return triangleWalls;
	}
	
//	@Override
	public double perimeter() {
		this.perimeter = triangleWalls[0] + triangleWalls[1] + triangleWalls[2];
		return this.perimeter;
	}
//	@Override
	public double area() {
		double s = (triangleWalls[0] + triangleWalls[1] + triangleWalls[2]) / 2;
		this.area = Math.sqrt(s * (s - triangleWalls[0]) * (s - triangleWalls[1]) * (s - triangleWalls[2]));
		return this.area;
	}
	
	public String toString() {
		String full;
		if (super.filler){
			full = "and is filled in with the lovely color!";
		}else {
			full = "however is sad and empty, wishing it could be such a  marvelous color!";
		}
		return "All of the sides are as follows: side 1: " + triangleWalls[0] + " Side 2: " + triangleWalls[1] + " Side 3: " + triangleWalls[2] + " Area: " + area + 
				" Perimeter: "+ perimeter + " and is " + super.pickedColor + " " + full;
	}
}
