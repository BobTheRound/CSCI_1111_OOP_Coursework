import java.util.Scanner;

public class Triangle extends GeometricObject{
	private double area;
	private int x;
	private double[][] builtTriangles = new double[5][3];
	
	private double perimeter;
	
	Triangle(){
		
	}
	public void setIntX(int x) {
		this.x = x;
	}
	public void setTriangle(double[][] builtTriangles) {
		this.builtTriangles = builtTriangles;
	}
	public double[][] getTriangles(){
		for(int i = 0; i < builtTriangles.length; i++) {
			for(int j = 0; j < 3; j++) {
				builtTriangles[i][j] = Math.random() * 10;
			}
		}
		return builtTriangles;
	}

	public double perimeter() {
		
		for (int i = 0; i < 5; i++) {
		this.perimeter =  builtTriangles[i][0] + builtTriangles[i][1] + builtTriangles[i][2];
		
		}
		return this.perimeter;
	}
	
	public double area() {
	
		for (int i = 0; i < 5; i++) {
			double s = (builtTriangles[i][0] + builtTriangles[i][1] + builtTriangles[i][2]);
			this.area = Math.sqrt(s * (s - builtTriangles[i][2]) * (s - builtTriangles[i][1]) * (s - builtTriangles[i][0]));
		}
		
		return this.area;
	}
	
	public String toString() {
		
		String full;
		if (super.filler){
			full = "and is "+ super.pickedColor;
		}else {
			full = "is empy and boring!";
		}
		return "All of the sides are as follows: side 1: " + builtTriangles[x][0] + " Side 2: " + builtTriangles[x][1] + " Side 3: " 
		+ builtTriangles[x][2] + " Area: " + area + " Perimeter: "+ perimeter + " and is " + full;
	
	}
}