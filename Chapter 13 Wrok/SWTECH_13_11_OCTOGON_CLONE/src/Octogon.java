
public class Octogon extends GeometricObject implements Cloneable{

	private double wallSize;
	private double perimeter;
	private double area;
	final double[] OCTOWALLCOUNT = new double [8];
	
	Octogon(){
		
	}
//	public GeometricObject clone(){
//		GeometricObject clonedOcto = new GeometricObject();
//		clonedOcto.buildOctogon();
//		
//		return clonedOcto;
//	}

	public void buildOctogon() {
		GeometricObject octo1 = new GeometricObject();
		this.wallSize = octo1.setWall(20);
			for(int i = 0; i < OCTOWALLCOUNT.length; i++) {
				OCTOWALLCOUNT[i] = this.wallSize;
			}
		getPerimeter();
		getArea();
		System.out.println(toString());
	}
	
	public double getPerimeter() {
		return this.perimeter = this.wallSize * OCTOWALLCOUNT.length;
	}
	
	public double getArea() {
		return this.area = (2 + (4 / (Math.sqrt(2))) * this.wallSize * this.wallSize);
	}
	
	public String toString() {
		return "The GeometricObject has " + OCTOWALLCOUNT.length + " sides, each side is "
				+ this.wallSize + " units long. It has a perimeter of " + this.perimeter
				+ " and an area of " + this.area + " square units.";
	}

	@Override
	public Object clone() {
		
		try {
			System.out.println("We did it, Blackadder!");
			return super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Wait, nevermind.");
			return null;
		}
	}

	public int compareTo(GeometricObject octo1) {
		if (wallLength > octo1.wallLength) {
			return 1;
		}else if (wallLength < octo1.wallLength) {
			return -1;
		}else {
			System.out.println("this message prints if the clone is a good "
					+ "little carbon copy and only misbehaves when I'm not looking.");
			return 0;
		}
	}	
}



