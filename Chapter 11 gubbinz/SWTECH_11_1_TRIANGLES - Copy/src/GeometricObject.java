import java.util.Scanner;
import java.util.Date;

public class GeometricObject {

	private double perimeter;
	private double area;
	
	public double[] defaultSide;
	private double side1;
	private double side2;
	private double side3;
	
	private int colorPicker;
	private String pickedColor;
	
	private boolean substance;
	private Date date;
	
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	
	public double getSide3() {
		return side3;
	}
	
	public void setArea() {
		double s = (side1 + side2 + side3) / 2;
		this.area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));	
	}
	
	public double getArea() {
		
		return this.area;
	}
	
	public void setPerimeter() {
		this.perimeter = side1 + side2 + side3;
		
	}
	
	public double getPerimeter() {
		
		return this.perimeter;
	}
	
	public void getDateCreated() {
		date = new java.util.Date();
	}
	
	public Date setDateCreated() {
		getDateCreated();
		return date;
	}
	
	public String toString() {
		getDateCreated();
		return "All of the sides are as follows: side 1: " + side1 + " Side 2: " + side2 + " Side 3: " + side3 + " Area: " + area + 
				" Perimeter: "+ perimeter + " created on: "+ date;
	}
	public double[] makeUserSide() {
		Scanner input = new Scanner(System.in);
		this.defaultSide = new double[3];
		System.out.println("debugMe MakeRandomSide");
		for(int i = 0; i < 3; i ++) {
			System.out.println("please input the length of side " + (i + 1));
			this.defaultSide[i] = input.nextDouble();
		}
		return this.defaultSide;
	}
	
	public boolean validatePerimeter(){
		if (side1 + side2 >= side3 && side1 + side3 >= side2 && side2 + side3 >= side1) {
			System.out.println("The generated triangle is valid.");
			return true;
		} else {
			System.out.println("The generated triangle is invalid.");
		return false;
		}
	}	
	
	public boolean isFill() {
		Scanner input = new Scanner(System.in);
		System.out.println("is the triangle filled? (y/n + Enter/Return)");
		String uAnswer = input.next();
		if(uAnswer.equalsIgnoreCase("y")) {
			substance = true;			
		}else if(uAnswer.equalsIgnoreCase("n")) {
				substance = false;
		}else {
			double i = Math.random() * 10;
			if (i < 5) {
				substance = false;
			}else {
				substance = true;
			}
		}

		return substance;
	}
	
	public String palletTown() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a nunmber between 1 and 9, including 1 and 9 if desired");
		colorPicker = input.nextInt();
		
		switch(colorPicker) {
		case 1: this.pickedColor = (" a very rocky Pewter. ");
			return this.pickedColor;
			
		case 2: this.pickedColor = (" a rather watery Cerulean. ");
			return this.pickedColor;
		
		case 3: this.pickedColor = (" an electric Vermillion. ");
			return this.pickedColor;
			
		case 4: this.pickedColor = (" a verdant Celadon. ");
			return this.pickedColor;
			
		case 5: this.pickedColor = (" a sickly Fuchsia. ");
			return this.pickedColor;
			
		case 6: this.pickedColor = (" a curious looking Saffron. ");
			return this.pickedColor;	
			
		case 7: this.pickedColor = (" a firey Cinnabar. ");
			return this.pickedColor;
			
		case 8: this.pickedColor = (" a very grounded Viridian." );
			return this.pickedColor;
			
		case 9: this.pickedColor = (" a wonderful little Pallet of colors, painted in minature towns. ");
			return this.pickedColor;
			
		default: this.pickedColor = (" a splatter of Four Elite looking colors. ");
			return this.pickedColor;
			
		}
	}
	
	public String triangleBuild() {
		if(substance) {
			return "The triangle is filled with" + this.pickedColor;
		}else {
			return "The triangle is empty, with a border of" + this.pickedColor;
		}
		
	}
}
