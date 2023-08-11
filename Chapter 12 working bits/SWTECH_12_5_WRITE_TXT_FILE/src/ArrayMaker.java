import java.util.Arrays;

public class ArrayMaker {

	private int[] array = new int[100]; 
	private double turnMeToInt;

	
	public ArrayMaker() {
		
	}
	
	public int[] getArray() {
		
		for (int i = 0; i < array.length; i++) {
			turnMeToInt = Math.random() * 100;
			int value = (int)turnMeToInt;
			array[i] = value;
		}
		Arrays.sort(array);

		return array;
	}
	
	public String toString() {
		getArray();
		String hodor = "";
		for(int i = 0; i < array.length; i++) {
			hodor += array[i] + " ";
		
		}
		return hodor;
	}

}
