import java.util.Scanner;

public abstract class GeometricObject {

	private int pallet;
	protected String pickedColor;
	protected boolean filler;
	
	protected GeometricObject(){
		
	}
	
	protected abstract double perimeter();
	protected abstract double area();
	public abstract String toString();
	
	protected boolean isFill() {
		Scanner input = new Scanner(System.in);
		System.out.println("is the triangle filled? (y/n + Enter/Return)");
		String uAnswer = input.next();
		if(uAnswer.equalsIgnoreCase("y")) {
			filler = true;			
		}else if(uAnswer.equalsIgnoreCase("n")) {
			filler = false;
		}else {
			double i = Math.random() * 10;
			if (i < 5) {
				filler = false;
			}else {
				filler = true;
			}
		}

		return filler;
	}
	
	protected String palletTown() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a nunmber between 1 and 9, including 1 and 9 if desired");
		pallet = input.nextInt();
		
		switch(pallet) {
		case 1: this.pickedColor = (" a very rocky Pewter");
			return this.pickedColor;
			
		case 2: this.pickedColor = (" a rather watery Cerulean");
			return this.pickedColor;
		
		case 3: this.pickedColor = (" an electric Vermillion");
			return this.pickedColor;
			
		case 4: this.pickedColor = (" a verdant Celadon");
			return this.pickedColor;
			
		case 5: this.pickedColor = (" a sickly Fuchsia");
			return this.pickedColor;
			
		case 6: this.pickedColor = (" a curious looking Saffron");
			return this.pickedColor;	
			
		case 7: this.pickedColor = (" a firey Cinnabar");
			return this.pickedColor;
			
		case 8: this.pickedColor = (" a very grounded Viridian" );
			return this.pickedColor;
			
		case 9: this.pickedColor = (" a wonderful little Pallet of colors, painted in minature towns");
			return this.pickedColor;
			
		default: this.pickedColor = (" a splatter of Four Elite looking colors");
			return this.pickedColor;
			
		}
	}
	
}
