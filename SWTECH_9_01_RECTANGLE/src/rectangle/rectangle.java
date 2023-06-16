/*
 * Author: Robert Beauchamp
 * Date: 6/16/2023
 */
package rectangle;

public class rectangle {
	public static double height = 1;
	public static double width = 1;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rectangleSize r1 =  new rectangleSize();
		System.out.println("the first rectangle has an area of "+ r1.getArea(height, width) + " and a perimeter of " + r1.getPerimeter(height, width));
		
		rectangleSize r2 = new rectangleSize();
		r2.setSize(height = 4.0, width = 40.0);
		
		System.out.println("the second rectangle has an area of "+ r2.getArea(height, width) + " and a perimeter of " + r2.getPerimeter(height, width));
	
		rectangleSize r3 = new rectangleSize();
		r3.setSize(height = 3.5, width = 35.9);
		
		System.out.println("the third rectangle has an area of "+ r3.getArea(height, width) + " and a perimeter of " + r3.getPerimeter(height, width));
	}
	

}
