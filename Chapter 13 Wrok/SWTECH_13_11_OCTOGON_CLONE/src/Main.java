
public class Main {

	public static void main(String[] args) {
		Octogon o1 = new Octogon();
		o1.buildOctogon();
		o1.clone();
		System.out.println(o1.compareTo(o1));
	}
}
