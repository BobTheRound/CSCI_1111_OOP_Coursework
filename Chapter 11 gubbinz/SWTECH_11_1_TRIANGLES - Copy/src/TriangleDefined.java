/*
 * Author: Robert Beauchamp
 * Date: 8/1/2023
 * purpose: define two triangle objects. the "Default" triangle will be composed of walls using the math.random ()
 * the defined triangle object will be composed of sidee1, side2, and side3, each holding a length of 1.
 * 
 * Define the area, define the perimeter.
 * 
 * assignment requirements:
 * A method named getArea() that returns the area of this triangle.
 * A method named getPerimeter() that returns the perimeter of this triangle.
 * A method named toString() that returns a string description for the triangle.
 */


import java.util.Scanner;
public class TriangleDefined extends GeometricObject {	
	TriangleDefined(){ // default constructor
		makeUserSide();
		setSide1(defaultSide[0]);
		setSide2(defaultSide[1]);
		setSide3(defaultSide[2]);
		getPerimeter();
		getArea();
		validatePerimeter();
	}
	
	TriangleDefined(double side1, double side2, double side3){ //fixed triangle
		getPerimeter();
		getArea();
		validatePerimeter();	
	}
	
}
