
import java.util.Scanner;

public abstract class GeometricObject implements Colorable {
	private int pallet;
	protected String pickedColor;
	protected boolean filler;
	
	protected GeometricObject(){
		
	}
	
	protected abstract double perimeter();
	protected abstract double area();
	public abstract String toString();
	
	@Override
	public boolean isFill() {
		double randomAnswer = Math.random() * 10;
		if(randomAnswer >= 5) {
			filler = true;			
		}else {
			filler = false;
		}

		return filler;
	}
	
	@Override
	public String palletTown() {
		Scanner input = new Scanner(System.in);
		System.out.println("This triangle is colorable! Input a nunmber between 1 and 9, to color the filled triangle");
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
