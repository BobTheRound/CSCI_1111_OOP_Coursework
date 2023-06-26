/*
 * Author: Robert Beauchamp
 * Date: 6/16/2023
 */
package rectangle;

public class rectangle {
	public static double height = 1;
	public static double width = 1;	
	
	public double getArea(double height, double width){
		double area = height * width;
		
		return area;
	}
	
	public double getPerimeter(double height, double width) {
		double perimeter = ((height * 2) + (width * 2));
		
		return perimeter;
	}
	
	public void setSize(double height, double width) {
		
	}
	
	public static void main(String[] args) {
		
		rectangle r1 =  new rectangle();
		System.out.println("the first rectangle has an area of "+ r1.getArea(height, width) + " and a perimeter of " + r1.getPerimeter(height, width));
		
		rectangle r2 = new rectangle();
		r2.setSize(height = 4.0, width = 40.0);
		
		System.out.println("the second rectangle has an area of "+ r2.getArea(height, width) + " and a perimeter of " + r2.getPerimeter(height, width));
	
		rectangle r3 = new rectangle();
		r3.setSize(height = 3.5, width = 35.9);
		
		System.out.println("the third rectangle has an area of "+ r3.getArea(height, width) + " and a perimeter of " + r3.getPerimeter(height, width));
	}

}
