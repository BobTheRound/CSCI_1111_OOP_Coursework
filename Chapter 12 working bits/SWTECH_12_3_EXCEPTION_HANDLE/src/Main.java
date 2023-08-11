
public class Main {

	public static void main(String[] args) {
		boolean done = false;
		NumberArray numbersInMain = new NumberArray();
		numbersInMain.getArray();
		numbersInMain.userPick();
		
		while(!done) {
		try {
			System.out.println(numbersInMain.toString());
			done = true;
			
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("out of bounds exception, try again.");
				numbersInMain.userPick();
			}
		}
	}

}
