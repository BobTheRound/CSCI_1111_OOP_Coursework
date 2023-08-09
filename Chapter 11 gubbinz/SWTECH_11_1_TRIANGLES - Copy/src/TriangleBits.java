
public class TriangleBits {
	
	public static void main(String[] args) {
		TriangleDefined triangle1 = new TriangleDefined(1, 1, 1);
		triangle1.setSide1(1);
		triangle1.setSide2(1);
		triangle1.setSide3(1);
		triangle1.setPerimeter();
		triangle1.setArea();
		System.out.println(triangle1.toString());
		
		TriangleDefined triangle2 = new TriangleDefined();
		triangle2.setPerimeter();
		triangle2.setArea();
		triangle2.isFill();
		triangle2.palletTown();
		System.out.print(triangle2.triangleBuild());
		System.out.printf(triangle2.toString());
		
	}
	
}
