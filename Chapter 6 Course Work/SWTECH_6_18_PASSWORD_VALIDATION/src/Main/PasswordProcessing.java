package Main;

public class PasswordProcessing {

	public PasswordProcessing(String userPassword) {
		
	}
	
	public boolean passwordLength(String userPassword) {
		if (userPassword.length() >= 10){
			return true;
		}else {
			System.out.println("Your password is not long enough.");
			return false;
		}
	}
	
	public boolean passwordCharCheck(String userPassword) {
		int truthTick = 0;
		
		for(int i = 0; i < userPassword.length(); i++) {
			if (userPassword.charAt(i) >= 'A' && userPassword.charAt(i) <= 'Z') {
				truthTick += 1;
			} else if (userPassword.charAt(i) >= 'a' && userPassword.charAt(i) <= 'z') {
				truthTick += 1;
			}else if (userPassword.charAt(i) >= '0' && userPassword.charAt(i) <= '9') {
				truthTick += 1;
			}else {
				truthTick += 0;
			}
		}
		
		if (truthTick == userPassword.length()) {
			return true;
		}else {
			System.out.println("Your password contains an illegal character.");
			return false;
		}
	
	}
	
	public boolean numAmountCheck(String userPassword) {
		int numBalance = 0;
		
		for(int i = 0; i < userPassword.length(); i++) {
			if (userPassword.charAt(i) >= '0' && userPassword.charAt(i) <= '9') {
				numBalance += 1;
			}
		}
		if (numBalance >=2 ) {
			return true;
		}else {
			System.out.println("your password does not contain enough numbers");
			return false;
		}
	}
	
	public boolean charAmountCheck(String userPassword) {
		int charBalance = 0;
		
		for(int i = 0; i < userPassword.length(); i++) {
			if (userPassword.charAt(i) >= 'A' && userPassword.charAt(i) <= 'Z') {
				charBalance += 1;
			} else if (userPassword.charAt(i) >= 'a' && userPassword.charAt(i) <= 'z') {
				charBalance += 1;
			}	
		}
		
		if (charBalance >= 8) {
			return true;
		}else {
			System.out.println("Your password does not contain enough letters.");
			return false;
		}
	}

}
