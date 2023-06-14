package StringFinder;

public class stringSorting {

	public stringSorting(String stringIn) {
		
	}
	
	public String displayString(String stringIn) {
		System.out.println(stringIn);
		
		return stringIn;
	}
	
	public int stringSize(String stringIn) {
		int stringBig = stringIn.length();
		
		System.out.println("The user string is " + stringBig + " characters long.");
		return stringBig;
	}
	
	public int letterSetter(String stringIn, int letterCount) {
		
		for (int i = 0; i < stringIn.length(); i++) {
			if (stringIn.charAt(i) >= 'A' && stringIn.charAt(i) <= 'Z'){
				letterCount += 1;
			}else if (stringIn.charAt(i) >= 'a' && stringIn.charAt(i) <= 'z') {
				letterCount += 1;
			}
		}
		
		if(letterCount < 1) {
			System.out.println("there are zero letters.");
		}else if (letterCount == 1) {
			System.out.println("there is a total of "+ letterCount + " letter.");
		}else {
			System.out.println("there are a total of "+ letterCount + " letters.");
		}
		return letterCount;
	}
	

}
