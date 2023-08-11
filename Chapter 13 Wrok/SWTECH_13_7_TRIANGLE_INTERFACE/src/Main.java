
public class Main {

	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.getTriangles();
		t.perimeter();
		t.area();
		
		for(int i = 0; i < 5; i ++) {
			t.setIntX(i);
			if(t.isFill()) {
			t.palletTown();
			}
			System.out.println(t.toString());
		}
	}

}

